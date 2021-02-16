package result;



import java.sql.*;


public class Semister_Create {
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
            String sql="Create table Semister"+
                    "(CourseNo integer not null AUTO_INCREMENT,"+
                    "CourseName varchar(50),"+
                    "noOfSem Integer,"+
                    "semister1 varchar(50),"+
                    "semister2 varchar(50),"+
                    "semister3 varchar(50),"+
                    "semister4 varchar(50),"+
                    "semister5 varchar(50),"+
                    "semister6 varchar(50),"+
                    "Primary key(CourseNo))";
            
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}
