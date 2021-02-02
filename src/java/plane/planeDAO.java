/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plane;
import bean.Plane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author duncanleo
 */
public class planeDAO {
    
        public ArrayList findAll() throws SQLException, ClassNotFoundException{
        
         String driver = "com.mysql.jdbc.Driver";
         String dbName = "fts";
         String url = "jdbc:mysql://localhost/" + dbName + "?";
         String userName = "root"; 
         String passWord = ""; 
         String query = "SELECT * FROM users";
         Class.forName(driver);
         
            Connection con = DriverManager.getConnection(url, userName, passWord);
            PreparedStatement st = con.prepareStatement(query);


            ResultSet result = st.executeQuery();
            ArrayList<Plane> planes = new ArrayList<Plane>();
            Plane plane = null;

            if (result.next()) {
                plane = new Plane();
                plane.setModel(result.getString("model"));
                plane.setYear((Integer.parseInt(result.getString("year"))));
                plane.setCapacity(Integer.parseInt(result.getString("capacity")));
                planes.add(plane);
            }

            con.close();

            return planes;
        }       
}
         
   
