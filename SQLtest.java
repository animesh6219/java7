package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Animesh dubey 24.Jan. 2020
 */
public class SQLtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
             Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:e://test.db");
             if (con != null) {
             Statement stmt = con.createStatement();
             String main_table ="create table if not exists monthly_data(month_name char(6), days char(2), initial_amount real, initial_rice real, final_amount real, final_rice real)";
             stmt.execute(main_table);
             }
        } catch (Exception e) {
        }
    
    }   
}
