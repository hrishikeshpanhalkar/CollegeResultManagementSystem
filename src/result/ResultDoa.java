
package result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultDoa {

    static boolean Login(String name, String password) {
         boolean status=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
            PreparedStatement ps=con.prepareStatement("select Uname,Password from user ");
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                String sname=rs.getString("Uname");
                String spassword=rs.getString("Password");
                
                if(sname.equals(name) && spassword.equals(password) ){
                    status=true;
                }                
            }        
            rs.close();
        }catch(Exception e){
            System.out.println("Error:" +e.getMessage());
        }        
        return status;
    }

    static boolean ChangePass(String uname, String Opass, String Npass) {
        boolean status=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
            PreparedStatement ps=con.prepareStatement("select Uname,Password from user ");           
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                String sname=rs.getString("Uname");
                String spassword=rs.getString("Password");
                
                if(sname.equals(uname) && spassword.equals(Opass) ){
                    PreparedStatement ps1=con.prepareStatement("update user set Password='"+Npass+"' where Uname='"+uname+"'"); 
                    ps1.executeUpdate();
                    status=true;
                }                
            }        
            rs.close();
        }catch(Exception e){
            System.out.println("Error:" +e.getMessage());
        }        
        return status;  
    }

    static boolean AdminLogin(String name, String password) {
        boolean status=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
            PreparedStatement ps=con.prepareStatement("select Uname,Password from admin ");
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                String sname=rs.getString("Uname");
                String spassword=rs.getString("Password");
                
                if(sname.equals(name) && spassword.equals(password) ){
                    status=true;
                }                
            }        
            rs.close();
        }catch(Exception e){
            System.out.println("Error:" +e.getMessage());
        }        
        return status;    
    }

    static boolean AdminChangePass(String uname, String Opass, String Npass) {
        boolean status=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
            PreparedStatement ps=con.prepareStatement("select Uname,Password from admin ");           
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                String sname=rs.getString("Uname");
                String spassword=rs.getString("Password");
                
                if(sname.equals(uname) && spassword.equals(Opass) ){
                    PreparedStatement ps1=con.prepareStatement("update user set Password='"+Npass+"' where Uname='"+uname+"'"); 
                    ps1.executeUpdate();
                    status=true;
                }                
            }        
            rs.close();
        }catch(Exception e){
            System.out.println("Error:" +e.getMessage());
        }        
        return status; 
    }
    
}
