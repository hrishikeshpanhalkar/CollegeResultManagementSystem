package result;



import java.sql.*;


public class CreateAdmin {
    public static void main(String args[])
    {
        Connection con=null;
        Statement st=null;
        PreparedStatement ps=null;   
        String abc="admin"; 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
            System.out.println("Connection to database successfully!");
            System.out.println("Creating table in database.....");
            st=con.createStatement();
            String sql="Create table admin"+
                    "(UName varchar(50),"+
                    "Password varchar(50),"+
                    "Primary key(UName))";
            ps=con.prepareStatement("insert into admin values(?,?)");
            ps.setString(1,abc);
            ps.setString(2,abc);
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            ps.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}
