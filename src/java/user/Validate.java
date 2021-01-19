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
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thattshini
 */
public class Validate  {
            
    /**
     *
     * @param username
     * @param password
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static boolean checkUser(String username, String password) throws SQLException, ClassNotFoundException{
        
        
        String driver = "com.mysql.jdbc.Driver";
        String dbName = "fts";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root"; 
        String passWord = ""; 
        String query = "SELECT * FROM users WHERE email = ? and password = ?";
        
        boolean status = false; 
         
        Class.forName(driver);
      
          
        try{
            
            Connection con = DriverManager.getConnection(url, userName, passWord);
            PreparedStatement st= con.prepareStatement(query);


            st.setString(1,username);
            st.setString(2,password);



            ResultSet rs = st.executeQuery();

            status = rs.next();
        
        
      
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
            return status;
       
    
    }

    private void printSQLException(SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
