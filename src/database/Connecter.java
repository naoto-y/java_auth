package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecter {
    // db接続共通メソッド
    public static Connection DBConnection() {
        Connection conn = null;
        String DB_HOST = null;
        String DB_DRIVER = null;

        DB_HOST = "jdbc:mysql://java-sys.cnab0knjunjp.ap-northeast-1.rds.amazonaws.com";
        DB_DRIVER = "com.mysql.jdbc.Driver";

        try {
            Class.forName(DB_DRIVER);
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(
                DB_HOST + "/java_authrization",
                "admin",
                "jPrC3QutqSdb"
            );
            conn.setAutoCommit(false);
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
