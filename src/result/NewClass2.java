package result;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class NewClass2 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "root");
            InputStream in=new FileInputStream(new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\RESULT\\src\\result\\newReport.jrxml"));
            JasperDesign jd=JRXmlLoader.load(in);
            String sql="select * from result order by name";
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr=JasperCompileManager.compileReport(jd);
            JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  catch (JRException e) {
            System.out.println("error:"+e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewClass2.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}