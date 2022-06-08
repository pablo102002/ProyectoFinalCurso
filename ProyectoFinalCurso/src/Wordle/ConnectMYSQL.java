package Wordle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JLabel;

public class ConnectMYSQL{

	//Connection to MYSQL
		static Connection connection;
		static String url="jdbc:mysql://localhost:33306/Wordle";
		static String user="root";
		static String password="alumnoalumno";
		
		
		public static boolean  checkUser (String name) {

			boolean userExists=false;
			try {
				connection=DriverManager.getConnection(url,user,password); 
				Statement sentence=connection.createStatement();
				ResultSet rs = sentence.executeQuery("select User from Player"); 

				while (rs.next() && !userExists) { 
					String comprobarUsuarioExistente=rs.getString("User");
					System.out.println(comprobarUsuarioExistente);
					if (name.equals(comprobarUsuarioExistente)){
						userExists=true;
					}
				} 	
			}

			catch (Exception e) { 
				System.out.println("ERROR");
			}	
			return userExists;
		}
		
		public static void addUser (String name){	
			String query="insert into Player values ('"+ name +"',"+ 0 +")";
			try {
				connection=DriverManager.getConnection(url,user,password);
				Statement sentence=connection.createStatement();
				sentence.execute(query); 
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
		
		
		
		public static void Top5 (ArrayList<JLabel> name,ArrayList<JLabel> wins){	
			String query="select User,Wins from Player order by Wins DESC";
			try {
				connection=DriverManager.getConnection(url,user,password);
				Statement sentence=connection.createStatement();
				ResultSet rs=sentence.executeQuery(query);
				int i=0;
				while (rs.next() && i<5) { 
					name.get(i).setText(rs.getString("User"));
					wins.get(i).setText(rs.getString("Wins"));
					i++;
				} 
				

			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
}
