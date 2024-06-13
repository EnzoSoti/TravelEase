
package printing_system;
import java.sql.*;

public class database {
    public static Connection connect(){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/printing_db", "root", "PHW#84#jeor");
        }catch(SQLException e){}
        return conn;
        }
    
    public static boolean isInputInDB(String username, String password){
        boolean condition = false;
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/printing_db", "root", "PHW#84#jeor");
            Statement statement = connection.createStatement();
            String sql = "SELECT Email_address,Password FROM login_with_cardid";
            ResultSet result  = statement.executeQuery(sql);
            while(result.next()){
                if(result.getString(1).equalsIgnoreCase(username) && result.getString(2).equals(password)){
                    return condition = true;
                }
            }
        }catch(SQLException e){
            System.out.println("Error");
        }
        return condition;
            }
   
}
