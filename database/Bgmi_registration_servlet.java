package registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bgmi_registration_servlet
 */
@WebServlet("/register")
public class Bgmi_registration_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String team = request.getParameter("team_name");
		String p1 = request.getParameter("player1");
		String p1_id = request.getParameter("player1_id");
		String p2 = request.getParameter("player2");
		String p2_id = request.getParameter("player2_id");
		String p3 = request.getParameter("player3");
		String p3_id = request.getParameter("player3_id");
		String p4 = request.getParameter("player4");
		String p4_id = request.getParameter("player4_id");
		String sub = request.getParameter("substitute");
		String sub_id = request.getParameter("substitute_id");
		
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bgmi","root","123456");
		PreparedStatement pst = con.prepareStatement("insert into teams(NAMES,PLAYER_1_IGN,PLAYER_1_ID,PLAYER_2_IGN,PLAYER_2_ID,PLAYER_3_IGN,PLAYER_3_ID,PLAYER_4_IGN,PLAYER_4_ID,SUBTITUTE_IGN,SUBTITUTE_ID) values(?,?,?,?,?,?,?,?,?,?,?)");
	    pst.setString(1, team);
	    pst.setString(2, p1);
	    pst.setString(3, p1_id);
	    pst.setString(4, p2);
	    pst.setString(5, p2_id);
	    pst.setString(6, p3);
	    pst.setString(7, p3_id);
	    pst.setString(8, p4);
	    pst.setString(9, p4_id);
	    pst.setString(10, sub);
	    pst.setString(11, sub_id);
	    
	    pst.executeUpdate();
	    


	   } catch (Exception e) {
		e.printStackTrace();
	}}}
       
      


