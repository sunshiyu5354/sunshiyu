package com.sqldemo;

import java.sql.*;
import java.text.*;

public class Main {
	public static void main(String args[]) {
		// 声明Connection对象
		Connection con = null;
		// 驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		// URL指向要访问的数据库名mydata
		String url = "jdbc:mysql://localhost:3306/Demo";
		// MySQL配置时的用户名
		String user = "root";
		// MySQL配置时的密码
		String password = "ssy535499604";
		// 遍历查询结果集
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 1.getConnection()方法，连接数据库
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed()) {
				System.out.println("Succeeded connecting to the gongsi!");
			}
			// 2.创建statement对象，用来执行SQL语句
			Statement statement = con.createStatement();
			// 要执行的SQL语句
			String sql = "select * from gongsi";
			// 3.ResultSet类，用来存放获取的结果集！！
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("----------------------------");
			System.out.println("执行结果如下所示:");
			System.out.println("----------------------------");
			System.out.println("姓名" + "\t" + "职称" + "\t" + "编号" + "\t" + "工资");
			System.out.println("----------------------------");

			String job = null;
			String id = null;
			int empno;
			float sal;
			while (rs.next()) {
				// 获取stuname这列数据
				job = rs.getString("name");
				// 获取stuid这列数据
				id = rs.getString("post");
				empno = rs.getInt("empno");
				sal = rs.getFloat("sal");

				// 输出结果
				System.out.println(id + "\t" + job + "\t" + empno + "\t" + sal);
			}
			// rs.close();
			// con.close();
		} catch (ClassNotFoundException e) {
			// 数据库驱动类异常处理
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// 数据库连接失败异常处理
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("数据库数据成功获取！！");
		}

		// 预处理添加数据，其中有两个参数--“？”
		try {
			String name;
			String id;

			PreparedStatement psql;
			ResultSet res;
			psql = con.prepareStatement("insert into gongsi (name,post,empno,sal) " + "values(?,?,?,?)");
			psql.setString(1, "球球"); // 设置参数1，name 为王刚
			psql.setString(2, "秘书");
			psql.setInt(3, 3213); // 设置参数3，创建id为3212的数据

			// DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
			// Date myDate2 = date.parse("2016-02-03");
			// psql.setDate(4,new java.sql.Date(myDate2.getTime()));
			psql.setFloat(4, (float) 4000.3);
			psql.executeUpdate(); // 执行更新
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 预处理更新（修改）数据，将王刚的sal改为5000.0
		try {
			PreparedStatement psql;
			psql = con.prepareStatement("update gongsi set sal = ? where name = ?");
			psql.setFloat(1, (float) 3000.3);
			psql.setString(2, "王五");
			psql.executeUpdate();
		} catch (Exception e) { // TODO Auto-generated
			e.printStackTrace();
		}

		try {
			PreparedStatement psql; // 预处理删除数据
			psql = con.prepareStatement("delete from gongsi where sal > ?");
			psql.setFloat(1, 4500);
			psql.executeUpdate();
			psql.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
