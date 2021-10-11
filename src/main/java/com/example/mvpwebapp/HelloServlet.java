package com.example.mvpwebapp;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet (name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    //init() method can be invoked only once, it is used to initialize the servlet's life cycle
    //init() method is used to perform servlet initialization creating and loading objects
    // that are used by the servlet in the handling of its request.
    public void init(){
        message = "Hello";
    }// init ends


    // doGet(HttpServletRequest req, HttpServletResponse res) handles the GET request. It is invoked by the web container.
    // HTTP GET request is used to retrieve and request data from a specified resource in a server.
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        try
        {
            // A Connection is the session between the java application and database
            // connect() method of Java Socket class connects the specified socket to the server.
            Connection con = MyConnection.connect();

            // createStatement() Creates a Statement object for sending SQL statements to the database
            Statement stmt = con.createStatement();

            // executeUpdate() method is used to execute SQL statements which update or modify database.
            int row_count = stmt.executeUpdate("insert into inputs(username, password) values('"+name+"','"+pass+"')");
            System.out.println("Row insert :"+row_count);
        }// try ends
        catch(Exception ex)
        {
            System.out.println("Database Error :"+ex);
        }// catch ends

    }// doGet ends

    public void destroy(){

    }// destroy ends

} // class ends

