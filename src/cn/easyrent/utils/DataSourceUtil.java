package cn.easyrent.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DataSourceUtil {
	private static DataSource dataSource;

	static{
		getDataSource();
	}
	
	public static void getDataSource() {
		Context context=null;
		try {
			context = new InitialContext();
			dataSource=(DataSource)context.lookup("java:comp/env/news");
		} catch (NamingException e) {
			e.printStackTrace();
		}		
		
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn= dataSource.getConnection();		
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return conn;
	}
	
	public static int executeUpdate(Connection conn, PreparedStatement ps,
			String sql, Object[] oo) {
		int row = 0;
		try {
			ps = conn.prepareStatement(sql);

			if (oo != null) {
				for (int i = 0; i < oo.length; i++) {
					ps.setObject(i + 1, oo[i]);
				}
			}
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	public static ResultSet executeQuery(Connection conn, PreparedStatement ps,
			String sql, Object[] oo) {
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);

			if (oo != null) {
				for (int i = 0; i < oo.length; i++) {
					ps.setObject(i + 1, oo[i]);
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;

	}
	
	public static void colseAll(PreparedStatement ps, Connection conn,
			ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
