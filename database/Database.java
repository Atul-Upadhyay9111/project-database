package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    public static void main(String[] args) throws ClassNotFoundException {
 

    	        String createTableSQL = "CREATE TABLE IF NOT EXISTS teams ("
    	                + "ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,"
    	                + "NAMES VARCHAR(255) NOT NULL,"
    	                + "PLAYER_1_IGN VARCHAR(255) NOT NULL,"
    	                + "PLAYER_1_ID INT UNIQUE NOT NULL,"
    	                + "PLAYER_2_IGN VARCHAR(255) NOT NULL,"
    	                + "PLAYER_2_ID INT UNIQUE NOT NULL,"
    	                + "PLAYER_3_IGN VARCHAR(255) NOT NULL,"
    	                + "PLAYER_3_ID INT UNIQUE NOT NULL,"
    	                + "PLAYER_4_IGN VARCHAR(255) NOT NULL,"
    	                + "PLAYER_4_ID INT UNIQUE NOT NULL,"
    	                + "SUBTITUTE_IGN VARCHAR(255) NOT NULL,"
    	                + "SUBTITUTE_ID INT UNIQUE NOT NULL"
    	                + ")";
    	   	 try {
 	            Class.forName("com.mysql.cj.jdbc.Driver");
 	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bgmi", "root", "123456");

    	             Statement statement = con.createStatement(); 

    	            statement.executeUpdate(createTableSQL);
    	          
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	    }
    	}
