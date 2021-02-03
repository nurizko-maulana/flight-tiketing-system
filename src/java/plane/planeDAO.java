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
         String passWord = "root"; 
         String query = "SELECT * FROM users";
         Class.forName(driver);
         
            Connection con = DriverManager.getConnection(url, userName, passWord);
            PreparedStatement st = con.prepareStatement(query);


            ResultSet resultSet = st.executeQuery();
            ArrayList<Plane> planes = new ArrayList<Plane>();
            Plane plane = null;

            if (resultSet.next()) {
                plane = new Plane();
                plane.setId(resultSet.getInt("id"));
                plane.setCapacity(resultSet.getInt("capacity"));
                plane.setFeature_id(resultSet.getInt("feature_id"));
                plane.setModel(resultSet.getString("model"));
                plane.setYear(resultSet.getInt("year"));
                System.out.println(plane.getId());
                System.out.println(plane.getCapacity());
                System.out.println(plane.getModel());
                System.out.println(plane.getYear());
                System.out.println(plane.getFeature_id());
                planes.add(plane);
            }

            con.close();

            return planes;
        }       
}
         
   
