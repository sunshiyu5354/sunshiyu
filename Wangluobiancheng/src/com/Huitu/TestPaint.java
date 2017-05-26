package com.Huitu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TestPaint extends JComponent implements MouseListener {
	// �Զ���ؼ�
	java.util.List<Point> pointList = new ArrayList<Point>();
	private boolean ishei = true;
	private int currentX = 0;// ��ǰ����λ��X
	private int currentY = 0;// ��ǰ����λ��Y
	private boolean iswinnow = false;

	public TestPaint() {
		this.addMouseListener(this);
	}

	// ��������(���� ����)
	public void paint(Graphics g) {
		// ��������
		g.setColor(Color.BLUE);
		for (int i = -1; i <= 10; i++) {
			g.drawLine(20, (i * 50 + 70), 520, (i * 50 + 70));
			g.drawLine((i * 50 + 70), 20, (i * 50 + 70), 520);
		}
		// ��������
		for (Point p : pointList) {
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), Point.POINT_SIZE, Point.POINT_SIZE);
		}
		// �ж���Ӯ
		iswin(g);
	}

	public void iswin(Graphics g) {
		int dongxi = 0;
		// ��
		for (int nowX = currentX, i = 0; i < 5 && nowX <= 500; nowX += 50, i++) {
			Point point = findPoint(nowX, currentY);
			if (point != null) {
				if (ishei != true) {
					if (point.getColor() == Color.black) {// ����
						dongxi++;
					} else {
						break;
					}
				}
				if (ishei != false) {
					if (point.getColor() == Color.white) {// ����
						dongxi++;
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		// ��
		for (int nowX = currentX - 50, i = 0; i < 5 && nowX >= 0; nowX -= 50, i++) {
			Point point = findPoint(nowX, currentY);
			if (point != null) {
				if (ishei != true) {
					if (point.getColor() == Color.black) {
						dongxi++;
					} else {
						break;
					}
				}
				if (ishei != false) {
					if (point.getColor() == Color.white) {
						dongxi++;
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		// ��
		int nb = 0;
		for (int nowX = currentX, nowY = currentY, i = 0; i <= 5 && nowY <= 570; nowY += 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// �жϺ���
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						nb++;
					} else {
						break;
					}
				}
				// �жϰ���
				if (ishei != false) {
					if (point.getColor() == Color.WHITE) {
						nb++;
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}

		// ��
		for (int nowX = currentX, nowY = currentY - 60, i = 0; i <= 5 && nowY >= 0; nowY -= 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// �жϺ���
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						nb++;
					} else {
						break;
					}
				}
				// �жϰ���
				if (ishei != false) {
					if (point.getColor() == Color.WHITE) {
						nb++;
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		// ����
		int dnxb = 0;
		for (int nowX = currentX, nowY = currentY, i = 0; i <= 5 && nowY <= 570
				&& nowX <= 570; nowY += 60, nowX += 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// �жϺ���
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						dnxb++;
					} else {
						break;
					}
				}
				// �жϰ���
				if (ishei != false) {
					if (point.getColor() == Color.WHITE) {
						dnxb++;
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		// ����
		for (int nowX = currentX - 60, nowY = currentY - 60, i = 0; i <= 5 && nowY >= 0
				&& nowX >= 0; nowY -= 60, nowX -= 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// �жϺ���
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						dnxb++;
					} else {
						break;
					}
				}
				// �жϰ���
				if (ishei != false) {
					if (point.getColor() == Color.WHITE) {
						dnxb++;
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		// ����
		int xndb = 0;
		for (int nowX = currentX, nowY = currentY, i = 0; i <= 5 && nowY <= 570
				&& nowX > 0; nowY += 60, nowX -= 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// �жϺ���
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						xndb++;
					} else {
						break;
					}
				}
				// �жϰ���
				if (ishei != false) {
					if (point.getColor() == Color.WHITE) {
						xndb++;
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		// ����
		for (int nowX = currentX + 60, nowY = currentY - 60, i = 0; i <= 5 && nowY >= 0
				&& nowX <= 570; nowY -= 60, nowX += 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// �жϺ���
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						xndb++;
					} else {
						break;
					}
				}
				// �жϰ���
				if (ishei != false) {
					if (point.getColor() == Color.WHITE) {
						xndb++;
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		if (ishei != true) {
			System.out.println("�����Ѿ�����" + dongxi + "��");
		} else {
			System.out.println("�����Ѿ�����" + dongxi + "��");
		}
		if(dongxi>=5||nb>=5||dnxb>=5||xndb>=5){
			if(ishei != true){
				iswinnow = true;
				g.setColor(Color.red);
				g.setFont(new java.awt.Font("΢���ź�",Font.ITALIC,30));
				g.drawString("����ʤ", 260, 300);
			}else{
				iswinnow = true;
				g.setColor(Color.red);
				g.setFont(new java.awt.Font("΢���ź�",Font.ITALIC,30));
				g.drawString("����ʤ", 260, 300);
			}
		}
	}
	// �ҵ�
	public Point findPoint(int x, int y) {
		for (Point p : pointList) {
			if (p.getX() == x && p.getY() == y) {
				// �ж������Ƿ�����ͬ��
				return p;
			}
		}
		return null;
	}

	public void mouseClicked(MouseEvent e) {
		System.out.print(".." + e.getX() + "" + e.getY());
		int x = e.getX();
		int y = e.getY();
		// �������������
		double xianX = Math.round((x - 20) / 50.0);
		double xianY = Math.round((y - 20) / 50.0);
		// System.out.println(xian+Math.round(xian));
		x = ((int) xianX) * 50;
		y = ((int) xianY) * 50;
		// ��¼��ǰ����λ��
		currentX = x;
		currentY = y;
		// int x = e.getX()-Point.POINT_SIZE/2;
		// int y = e.getY()-Point.POINT_SIZE/2;
		boolean isHave = false;
		for (Point p : pointList) {
			if (p.getX() == x && p.getY() == y) {
				isHave = true;
			}
		}
		if (!isHave) {
			Point point = new Point(x, y);
			if (ishei == true) {
				point.setColor(Color.black);
				ishei = false;// ��
			} else {
				point.setColor(Color.white);
				ishei = true;// ��
			}
			pointList.add(point);
			// �û����� ���»���
			this.repaint();
		}

		// �ж�����
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
// g.drawLine(0,0,100,100);
// g.drawString(s,100,100);
// g.drawOval(100,100,100,100);
// g.drawRect(100,100,100,100);
// g.setColor(Color.BLUE);
// g.fillOval(100,100,100,100);