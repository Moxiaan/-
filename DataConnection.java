package model;

import java.sql.*;


public class DataConnection {
    private static Statement stat;
    
    public static Statement getStat() throws ClassNotFoundException, SQLException{
    	if(stat==null) init();
    	return stat;
    }
    private static void init() throws ClassNotFoundException, SQLException{
    	Class.forName("com.mysql.jdbc.Driver");
    	String url = "jdbc:mysql://188.131.132.153:3305/dafuweng?serverTimezone=UTC&characterEncoding=utf8" ; 
    	String name="root";
    	String pw = "123456";
    	Connection con = DriverManager.getConnection(url,name,pw);
    	stat = con.createStatement();
    }
}
