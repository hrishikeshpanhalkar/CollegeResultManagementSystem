package result;



import java.sql.*;


public class Student_Creation {
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
            String sql="Create table student"+
                    "(Roll_no integer not null,"+
                    "FullName varchar(200),"+
                    "photo longblob,"+
                    "Exam_no varchar(50),"+
                    "CourseName varchar(50),"+
                    "Semister varchar(50),"+                    
                    "Primary key(Roll_No,CourseName,Semister))";
            
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}
