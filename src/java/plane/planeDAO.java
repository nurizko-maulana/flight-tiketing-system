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
import java.sql.SQLException;
/**
 *
 * @author duncanleo
 */
public class planeDAO {
    
        public int registerUser(Plane user) throws SQLException, ClassNotFoundException{
        
         String driver = "com.mysql.jdbc.Driver";
         String dbName = "fts";
         String url = "jdbc:mysql://localhost/" + dbName + "?";
         String userName = "root"; 
         String passWord = ""; 
         String query = "INSERT INTO users(username, email, password, userType) VALUES(?,?, ?, ?)";
        
         
         int result = 0;
         
        Class.forName(driver);
      
          
         try{
        Connection con = DriverManager.getConnection(url, userName, passWord);
        PreparedStatement st= con.prepareStatement(query);
        
       
        st.setString(1,user.getUsername());
        st.setString(2,user.getEmail());
        st.setString(3, user.getPassword());
        st.setInt(4, user.getUserType());
        
        int insertStatus=0; 
       
        st.executeUpdate();
        
         System.out.println(insertStatus + "row affected");
        
      
         }
         catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
            return result;
       
    
    }
    
}
