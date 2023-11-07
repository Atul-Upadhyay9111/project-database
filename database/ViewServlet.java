package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewServlet {
    public static void main(String[] args) {
        viewTeams();
    }

    public static void viewTeams() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bgmi", "root", "123456");
            PreparedStatement pst = con.prepareStatement("select * from teams");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString(1);
                String team = rs.getString(2);
                String p1 = rs.getString(3);
                String p1_id = rs.getString(4);
                String p2 = rs.getString(5);
                String p2_id = rs.getString(6);
                String p3 = rs.getString(7);
                String p3_id = rs.getString(8);
                String p4 = rs.getString(9);
                String p4_id = rs.getString(10);
                String sub = rs.getString(11);
                String sub_id = rs.getString(12);

                System.out.println(id + "\t" + team + "\t" + p1 + "\t" + p1_id + "\t" + p2 + "\t" + p2_id + "\t" + p3 + "\t" + p3_id + "\t" + p4 + "\t" + p4_id + "\t" + sub + "\t" + sub_id);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
