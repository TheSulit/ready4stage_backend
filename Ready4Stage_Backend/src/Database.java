import java.io.*;
import java.sql.*;

public class Database {
    
    public Connection connectDB() {
        Connection myConnection = null;
        try {
            String dbUrl = "jdbc:mysql://127.0.0.1:8080/ready4stage";
            String username = "root";
            String password = "";
            myConnection = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Successfully connected to the Database");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return myConnection;
    }

    public void initializeDB() {
        try {
            Process process;
            if(isWindows()) {
                process = Runtime.getRuntime().exec("python src\\database\\initDB.py");
            } else {
                process = Runtime.getRuntime().exec("python src/database/initDB.py");
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("database initialized via python script (mysql-docker)");
    }

    public void createDBStatement (Connection connection, String statement) {
        try {
            Statement myStatement = connection.createStatement();
            ResultSet myResultSet = myStatement.executeQuery(statement);
            while (myResultSet.next()) {
                for (int i = 1; i <= myResultSet.getMetaData().getColumnCount(); i++)  {
                    System.out.print(myResultSet.getString(i) + " ");
                }
                System.out.println(" ");
            }
            
        } catch (SQLException sqle) {
            sqle.getSQLState();
        } 
    }

    private static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

}