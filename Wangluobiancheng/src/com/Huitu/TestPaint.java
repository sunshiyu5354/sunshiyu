package com.Huitu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TestPaint extends JComponent implements MouseListener {
	// 自定义控件
	java.util.List<Point> pointList = new ArrayList<Point>();
	private boolean ishei = true;
	private int currentX = 0;// 当前棋子位置X
	private int currentY = 0;// 当前棋子位置Y
	private boolean iswinnow = false;

	public TestPaint() {
		this.addMouseListener(this);
	}

	// 绘制内容(棋盘 棋子)
	public void paint(Graphics g) {
		// 绘制棋盘
		g.setColor(Color.BLUE);
		for (int i = -1; i <= 10; i++) {
			g.drawLine(20, (i * 50 + 70), 520, (i * 50 + 70));
			g.drawLine((i * 50 + 70), 20, (i * 50 + 70), 520);
		}
		// 绘制棋子
		for (Point p : pointList) {
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), Point.POINT_SIZE, Point.POINT_SIZE);
		}
		// 判断输赢
		iswin(g);
	}

	public void iswin(Graphics g) {
		int dongxi = 0;
		// 东
		for (int nowX = currentX, i = 0; i < 5 && nowX <= 500; nowX += 50, i++) {
			Point point = findPoint(nowX, currentY);
			if (point != null) {
				if (ishei != true) {
					if (point.getColor() == Color.black) {// 黑子
						dongxi++;
					} else {
						break;
					}
				}
				if (ishei != false) {
					if (point.getColor() == Color.white) {// 白子
						dongxi++;
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		// 西
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
		// 南
		int nb = 0;
		for (int nowX = currentX, nowY = currentY, i = 0; i <= 5 && nowY <= 570; nowY += 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// 判断黑子
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						nb++;
					} else {
						break;
					}
				}
				// 判断白子
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

		// 北
		for (int nowX = currentX, nowY = currentY - 60, i = 0; i <= 5 && nowY >= 0; nowY -= 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// 判断黑子
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						nb++;
					} else {
						break;
					}
				}
				// 判断白子
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
		// 东南
		int dnxb = 0;
		for (int nowX = currentX, nowY = currentY, i = 0; i <= 5 && nowY <= 570
				&& nowX <= 570; nowY += 60, nowX += 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// 判断黑子
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						dnxb++;
					} else {
						break;
					}
				}
				// 判断白子
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
		// 西北
		for (int nowX = currentX - 60, nowY = currentY - 60, i = 0; i <= 5 && nowY >= 0
				&& nowX >= 0; nowY -= 60, nowX -= 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// 判断黑子
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						dnxb++;
					} else {
						break;
					}
				}
				// 判断白子
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
		// 西南
		int xndb = 0;
		for (int nowX = currentX, nowY = currentY, i = 0; i <= 5 && nowY <= 570
				&& nowX > 0; nowY += 60, nowX -= 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// 判断黑子
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						xndb++;
					} else {
						break;
					}
				}
				// 判断白子
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
		// 东北
		for (int nowX = currentX + 60, nowY = currentY - 60, i = 0; i <= 5 && nowY >= 0
				&& nowX <= 570; nowY -= 60, nowX += 60, i++) {
			Point point = findPoint(nowX, nowY);
			if (point != null) {
				// 判断黑子
				if (ishei != true) {
					if (point.getColor() == Color.BLACK) {
						xndb++;
					} else {
						break;
					}
				}
				// 判断白子
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
			System.out.println("黑子已经连成" + dongxi + "个");
		} else {
			System.out.println("白子已经连成" + dongxi + "个");
		}
		if(dongxi>=5||nb>=5||dnxb>=5||xndb>=5){
			if(ishei != true){
				iswinnow = true;
				g.setColor(Color.red);
				g.setFont(new java.awt.Font("微软雅黑",Font.ITALIC,30));
				g.drawString("黑子胜", 260, 300);
			}else{
				iswinnow = true;
				g.setColor(Color.red);
				g.setFont(new java.awt.Font("微软雅黑",Font.ITALIC,30));
				g.drawString("白子胜", 260, 300);
			}
		}
	}
	// 找点
	public Point findPoint(int x, int y) {
		for (Point p : pointList) {
			if (p.getX() == x && p.getY() == y) {
				// 判断坐标是否有相同的
				return p;
			}
		}
		return null;
	}

	public void mouseClicked(MouseEvent e) {
		System.out.print(".." + e.getX() + "" + e.getY());
		int x = e.getX();
		int y = e.getY();
		// 算出在那条线上
		double xianX = Math.round((x - 20) / 50.0);
		double xianY = Math.round((y - 20) / 50.0);
		// System.out.println(xian+Math.round(xian));
		x = ((int) xianX) * 50;
		y = ((int) xianY) * 50;
		// 记录当前棋子位置
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
				ishei = false;// 黑
			} else {
				point.setColor(Color.white);
				ishei = true;// 白
			}
			pointList.add(point);
			// 用户触发 重新绘制
			this.repaint();
		}

		// 判断棋子
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
