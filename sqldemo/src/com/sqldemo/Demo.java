package com.sqldemo;

import java.sql.*;

public class Demo {
	public static void main(String args[]) {
		// ����Connection����

		// Connection con2 = null;
		try {
			// con.setAutoCommit(false);// �������� ����ִ�е���䶼�������� ԭ����
			// try {
			// Class.forName("com.mysql.jdbc.Driver");
			// 1.getConnection()����������MySQL���ݿ�
			// con2 =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=ssy535499604");
			// if (!con.isClosed()) {
			// System.out.println("Succeeded connecting to the emp2");
			// }
			// } catch (Exception e) {
			// e.printStackTrace();
			// }
			for (int i = 0; i < 100; i++) {
				Connection con = Mysqlutil.getInstace();
				Connection con2 = Mysqlutil.getInstace();
				new Thread(new TestShiwu1(con)).start();
				new Thread(new TestShiwu2(con2)).start();
			}
			// con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			// try {
			// con.rollback();
			// } catch (Exception e1) {
			// e1.printStackTrace();
			// }
		}

	}
}