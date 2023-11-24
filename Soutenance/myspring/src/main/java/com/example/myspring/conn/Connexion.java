package com.example.myspring.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    public static Connection getConn() throws Exception{
        String url= "jdbc:postgresql://localhost:5432/soutenancesteven";
        String user="postgres";
        String pass="steven";
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url,user,pass);
        return conn;
    }
}
