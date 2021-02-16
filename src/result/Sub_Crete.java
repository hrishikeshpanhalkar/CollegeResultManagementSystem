package result;



import java.sql.*;


public class Sub_Crete {
    public static void main(String args[])
    {
        Connection con=null;
        Statement st=null;
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
            System.out.println("Connection to database successfully!");
            System.out.println("Creating table in database.....");
            st=con.createStatement();
            String sql="Create table subject"+
                    "(CourseName varchar(50),"+
                    "SubCode varchar(50),"+
                    "SubName varchar(100),"+
                    "Credits Integer,"+
                    "External Integer,"+
                    "Internal Integer,"+
                    "Total Integer,"+
                    "subLevel varchar(50),"+
                    "subType varchar(50),"+
                    "Primary key(subName))";
            
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}
