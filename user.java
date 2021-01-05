package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class user {
   private int uid;
   private String uname;
   private String upw;
public user() {
	super();
	this.uid = uid;
	this.uname = uname;
	this.upw = upw;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpw() {
	return upw;
}
public void setUpw(String upw) {
	this.upw = upw;
}
/*
 * µÇÂ¼
 */
public boolean login(String uid,String upw) throws SQLException, ClassNotFoundException{
	String sql="select *from user where uid='"+uid+"' and upw='"+upw+"' ";
	ResultSet rs = DataConnection.getStat().executeQuery(sql);
	if(rs.next())
		return true;
	return false;
}
/*×¢²á*/
public void adduser(String uid,String uname,String upw) throws SQLException, ClassNotFoundException{
	String sql = "insert into user(uid,upw,uname)values('"
			+uid+"','"+uname+"','"+upw+"')";
	DataConnection.getStat().executeUpdate(sql);
}
   
}

