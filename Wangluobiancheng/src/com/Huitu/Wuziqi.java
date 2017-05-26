package com.Huitu;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.*;

public class Wuziqi extends JFrame implements MouseListener {
	public static void main(String args[]) {
		new Wuziqi();
	}

	Vector v = new Vector();
	Vector white = new Vector();
	Vector black = new Vector();
	JButton btnstart = new JButton("��ʼ");
	JButton btnstop = new JButton("ֹͣ");
	JToolBar tool = new JToolBar();
	boolean b; // �����ж� ���廹�Ǻ���
	int blackcount, whitecount; // �������

	//���췽�� 
	public Wuziqi() {
		super("������");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �رհ�ť
		Container con = this.getContentPane();
		this.addMouseListener(this);// ���Ӽ���
		tool.add(btnstart);// ���Ӱ�ť
		tool.add(btnstop);
		this.setSize(550, 500);// ���ô����С
		this.setVisible(true);
	}

	int w = 20; // ����С ��˫��
	int px = 100, py = 100; // ���̵�����
	int pxw = (px + w), pyw = (py + w);
	int width = w * 16, height = w * 16;
	int vline = (width + px); // ��ֱ�ߵĳ���
	int hline = (height + py); // ˮƽ�ߵĳ���

	//������ 
	public void paint(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight()); // ������
		g.setColor(Color.BLACK); // ����������ɫ
		g.drawRect(px, py, width, height); // �����С
		g.drawString("����������", 110, 70);
		for (int i = 0; i < 15; i++) {
			g.drawLine(pxw + i * w, py, pxw + i * w, hline);// ÿ�����ߺ�����
			g.drawLine(px, pyw + i * w, vline, pyw + i * w);
		}
		for (int x = 0; x < v.size(); x++) {
			String str = (String) v.get(x);
			String tmp[] = str.split("-");
			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);
			a = a * w + px;
			b = b * w + py;
			if (x % 2 == 0) {
				g.setColor(Color.BLUE);
			} else {
				g.setColor(Color.RED);
			}
			g.fillArc(a - w / 2, b - w / 2, w, w, 0, 360);
		}
	}

	public void updeta(Graphics g) {
		this.paint(g);
	}

	public void victory(int x, int y, Vector contain) { // �ж�ʤ���ķ���
		int cv = 0; // ���㴹ֱ�ı���
		int ch = 0; // ����ˮƽ�ı���
		int ci1 = 0; // ����б��ı���1
		int ci2 = 0; // ����б��ı���2
		for (int i = 1; i < 5; i++) {
			if (contain.contains((x + i) + "-" + y))
				ch++;
			else
				break;
		}
		System.out.println("ǰ��ִ����" + ch + "��");
		for (int i = 1; i < 5; i++) {
			if (contain.contains((x - i) + "-" + y))
				ch++;
			else
				break;
		}
		System.out.println("����ִ����" + ch + "��");
		for (int i = 1; i < 5; i++) {
			if (contain.contains(x + "-" + (y + i)))
				cv++;
			else
				break;
		}
		for (int i = 1; i < 5; i++) {
			if (contain.contains(x + "-" + (y - i)))
				cv++;
			else
				break;
		}
		for (int i = 1; i < 5; i++) {
			if (contain.contains((x + i) + "-" + (y + i)))
				ci1++;
			else
				break;
		}
		for (int i = 1; i < 5; i++) {
			if (contain.contains((x - i) + "-" + (y - i)))
				ci1++;
			else
				break;
		}
		for (int i = 1; i < 5; i++) {
			if (contain.contains((x - i) + "-" + (y + i)))
				ci2++;
			else
				break;
		}
		for (int i = 1; i < 5; i++) {
			if (contain.contains((x + i) + "-" + (y - i)))
				ci2++;
			else
				break;
		}
		if (ch >= 4 || cv >= 4 || ci1 >= 4 || ci2 >= 4) {
			System.out.println(v.size() + "����");
			if (v.size() % 2 == 0) { // �ж�ż���Ǻ���ʤ������������ʤ��
				JOptionPane.showMessageDialog(null, "��ϲ�� ����Ӯ��");
			} else {
				JOptionPane.showMessageDialog(null, "��ϲ�� ����Ӯ��");
			}
			this.v.clear();
			this.black.clear();
			this.white.clear();
			this.repaint();
		}
		System.out.println(ch + " " + cv + " " + ci1 + " " + ci2);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == e.BUTTON1) {
			int x = e.getX();
			int y = e.getY();
			x = (x - x % w) + (x % w > w / 2 ? w : 0);
			y = (y - y % w) + (y % w > w / 2 ? w : 0);
			x = (x - px) / w;
			y = (y - py) / w;
			if (x >= 0 && y >= 0 && x <= 16 && y <= 16) {
				if (v.contains(x + "-" + y)) {
					System.out.println("��������");
				} else {
					v.add(x + "-" + y);
					this.repaint();
					if (v.size() % 2 == 0) {
						black.add(x + "-" + y);
						this.victory(x, y, black);
						System.out.println("����");
					} else {
						white.add(x + "-" + y);
						this.victory(x, y, white);
						System.out.println("����");
					}
					System.out.println(e.getX() + "-" + e.getY());
				}
			} else {
				System.out.println(e.getX() + "-" + e.getY() + "|" + x + "-" + y + "\t�����߽�");
			}
		}
		if (e.getButton() == e.BUTTON3) { // ���巽��
			System.out.println("����Ҽ�-����");
			if (v.isEmpty()) {
				JOptionPane.showMessageDialog(this, "û������Ի�");
			} else {
				if (v.size() % 2 == 0) { // �ж��ǰ׷����� ���Ǻڷ�����
					blackcount++;
					if (blackcount > 3) {
						JOptionPane.showMessageDialog(this, "�����Ѿ���������");
					} else {
						v.remove(v.lastElement());
						this.repaint();
					}
				} else {
					whitecount++;
					if (whitecount > 3) {
						JOptionPane.showMessageDialog(this, "�����Ѿ���������");
					} else {
						v.remove(v.lastElement());
						this.repaint();
					}
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}