package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

    public static void main(String[] args) {

        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db", "root", "Sreeram@113");

            //String insert = "insert into Employees(eid, ename, salary, job) values (112, 'Balu', 90000, 'MD');";
           // String update = "update Employees set ename='Micheal' where eid = 112;";
            String delete = "Delete from employees where eid =112;";
            Statement stmt = conn.createStatement();
            int count = stmt.executeUpdate(delete);
            //System.out.println(count + " records updated");
            System.out.println(count + " record deleted.");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
