package result;



import java.sql.*;


public class Course_Create {
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
            String sql="Create table Course"+
                    "(CourseNo integer not null AUTO_INCREMENT,"+
                    "CourseName varchar(50),"+
                    "Faculty varchar(50),"+
                    "Degree varchar(50),"+
                    "CollegeType varchar(50),"+ 
                    "Duration integer,"+
                    "CoursePattern varchar(50),"+
                    "FeePattern varchar(50),"+
                    "seat integer,"+
                    "Primary key(CourseNo))";
            
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}
