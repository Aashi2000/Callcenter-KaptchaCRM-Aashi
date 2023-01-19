import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sound.midi.SysexMessage;
class JDBC{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/callcenter";
            String username="root";
            String password="aashi@11";

            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Connection is Closed");
            }
            else{
                System.out.println("Connection Created....! Hurray...!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}