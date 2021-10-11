package com.example.mvpwebapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnection{
    static String driveName = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/form?autoReconnect=true&useSSL=false";
    static String user = "root";
    static String password = "root";

    public static Connection connect()
    {
        Connection con = null;
        try
        {
            Class.forName(driveName);
            con = DriverManager.getConnection(url, user, password);

            if(con!=null)
            {
                System.out.println("success");
            } //if ends
        } //try ends
        catch(Exception ex)
        {
            System.out.println("DB error :"+ex);
        } //catch ends

        return con;
    } //connect method ends
} //class ends

