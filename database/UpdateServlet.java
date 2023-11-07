package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateServlet {

	public static void main(String[] args) {
		
   updateteam();
	}
	public static void updateteam() {
		int id = 7;
		String team = "team_name";
		String p1 = "player1";
		int p1_id = 11;
		String p2 = "player2";
		int p2_id = 22;
		String p3 = "player3";
		int p3_id = 33;
		String p4 = "player4";
		int p4_id =44;
		String sub = "substitute";
		int sub_id = 55;
		
		
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bgmi", "root", "123456");
	            PreparedStatement pst = con.prepareStatement("update teams set NAMES=?,PLAYER_1_IGN=?,PLAYER_1_ID=?,PLAYER_2_IGN=?,PLAYER_2_ID=?,PLAYER_3_IGN=?,PLAYER_3_ID=?,PLAYER_4_IGN=?,PLAYER_4_ID=?,SUBTITUTE_IGN=?,SUBTITUTE_ID=? where id=?");
	            pst.setString(1, team);
	    	    pst.setString(2, p1);
	    	    pst.setLong(3, p1_id);
	    	    pst.setString(4, p2);
	    	    pst.setLong(5, p2_id);
	    	    pst.setString(6, p3);
	    	    pst.setLong(7, p3_id);
	    	    pst.setString(8, p4);
	    	    pst.setLong(9, p4_id);
	    	    pst.setString(10, sub);
	    	    pst.setLong(11, sub_id);
	    	    pst.setInt(12, id);
	          
                pst.executeUpdate();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


}
