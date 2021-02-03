/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import bean.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author thattshini
 */
public class registerDAO  {
            
    public int registerUser(User user) throws SQLException, ClassNotFoundException{
        
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

    private void printSQLException(SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}