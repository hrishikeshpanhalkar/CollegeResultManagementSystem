package result;



import java.sql.*;


public class createresult {
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
            String sql="Create table result"+
                    "(Roll_no Integer,"+
                    "StudentName varchar(50),"+
                    "SubCode varchar(50),"+
                    "CourseName varchar(50),"+
                    "Semister varchar(50),"+
                    "SubjectName varchar(100),"+
                    "Credits Integer,"+
                    "External Integer,"+
                    "ExternalGrade varchar(10),"+
                    "Internal Integer,"+
                    "InternalGrade varchar(10),"+
                    "Total Integer,"+
                    "TotalGrade varchar(10),"+
                    "Gradepoints Integer,"+
                    "CG Integer,"+
                    "Primary key(Roll_no,CourseName,Semister,SubjectName))";
            
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}
