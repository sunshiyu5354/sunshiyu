package com.qunliao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	private static Connection sq = null;
	static {
		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 1.getConnection()方法，连接MySQL数据库
			sq = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=ssy535499604");
			// if(!sq.isClosed()){
			// System.out.println("Succeeded connecting to the emp");
			// }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public MyConnection() {

	}

	public static Connection getIntance() {

		return sq;
	}
}
