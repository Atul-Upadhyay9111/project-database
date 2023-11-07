package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DeleteServlet {
	public static void main(String args[]) {
		
    deleteteam(6);}
	public static boolean deleteteam(int bgmiteamid) {
		boolean f=false;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bgmi","root","123456");
		PreparedStatement pst = con.prepareStatement("Delete from teams where id =?");
	    pst.setLong(1, bgmiteamid);
	    
	    pst.executeUpdate();
	    f=true;
	    
        } catch (Exception e) {
		e.printStackTrace();
	}
		return f;}
	}