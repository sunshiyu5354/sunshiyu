package com.sqldemo;

import java.sql.*;
import java.text.*;

public class Main {
	public static void main(String args[]) {
		// ����Connection����
		Connection con = null;
		// ����������
		String driver = "com.mysql.jdbc.Driver";
		// URLָ��Ҫ���ʵ����ݿ���mydata
		String url = "jdbc:mysql://localhost:3306/Demo";
		// MySQL����ʱ���û���
		String user = "root";
		// MySQL����ʱ������
		String password = "ssy535499604";
		// ������ѯ�����
		try {
			// ������������
			Class.forName(driver);
			// 1.getConnection()�������������ݿ�
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed()) {
				System.out.println("Succeeded connecting to the gongsi!");
			}
			// 2.����statement��������ִ��SQL���
			Statement statement = con.createStatement();
			// Ҫִ�е�SQL���
			String sql = "select * from gongsi";
			// 3.ResultSet�࣬������Ż�ȡ�Ľ��������
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("----------------------------");
			System.out.println("ִ�н��������ʾ:");
			System.out.println("----------------------------");
			System.out.println("����" + "\t" + "ְ��" + "\t" + "���" + "\t" + "����");
			System.out.println("----------------------------");

			String job = null;
			String id = null;
			int empno;
			float sal;
			while (rs.next()) {
				// ��ȡstuname��������
				job = rs.getString("name");
				// ��ȡstuid��������
				id = rs.getString("post");
				empno = rs.getInt("empno");
				sal = rs.getFloat("sal");

				// ������
				System.out.println(id + "\t" + job + "\t" + empno + "\t" + sal);
			}
			// rs.close();
			// con.close();
		} catch (ClassNotFoundException e) {
			// ���ݿ��������쳣����
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// ���ݿ�����ʧ���쳣����
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("���ݿ����ݳɹ���ȡ����");
		}

		// Ԥ����������ݣ���������������--������
		try {
			String name;
			String id;

			PreparedStatement psql;
			ResultSet res;
			psql = con.prepareStatement("insert into gongsi (name,post,empno,sal) " + "values(?,?,?,?)");
			psql.setString(1, "����"); // ���ò���1��name Ϊ����
			psql.setString(2, "����");
			psql.setInt(3, 3213); // ���ò���3������idΪ3212������

			// DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
			// Date myDate2 = date.parse("2016-02-03");
			// psql.setDate(4,new java.sql.Date(myDate2.getTime()));
			psql.setFloat(4, (float) 4000.3);
			psql.executeUpdate(); // ִ�и���
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Ԥ������£��޸ģ����ݣ������յ�sal��Ϊ5000.0
		try {
			PreparedStatement psql;
			psql = con.prepareStatement("update gongsi set sal = ? where name = ?");
			psql.setFloat(1, (float) 3000.3);
			psql.setString(2, "����");
			psql.executeUpdate();
		} catch (Exception e) { // TODO Auto-generated
			e.printStackTrace();
		}

		try {
			PreparedStatement psql; // Ԥ����ɾ������
			psql = con.prepareStatement("delete from gongsi where sal > ?");
			psql.setFloat(1, 4500);
			psql.executeUpdate();
			psql.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
