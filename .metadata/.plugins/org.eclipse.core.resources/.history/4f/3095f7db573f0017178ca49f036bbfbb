package com.sqldemo;

import java.sql.*;
import java.util.*;

public class Mysqlutil {
	// 保证只有一个链接
	// 初始化连接池
	private static LinkedList<Connection> cons = new LinkedList<Connection>();
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			for (int i = 0; i < 20; i++) {

				Connection con = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=ssy535499604");
				if (!con.isClosed()) {
					System.out.println("初始化链接");
					cons.add(con);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Mysqlutil() {

	}

	public static Connection getInstace() {
		while (true) {
			synchronized (cons) {
				if (cons.size() > 0) {
					System.out.println("有线程借走了一条链接,当前有" + cons.size() + "条");
					return cons.removeFirst();
				} else {
					try {
						System.out.println("链接用光了，等待链接");
						cons.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void freeConnect(Connection con) {
		synchronized (cons) {
			System.out.println("有人还回链接,当前有" + cons.size() + "条");
			cons.add(con);
			cons.notifyAll();
		}

	}
}
