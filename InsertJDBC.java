import java.sql.*;


public class InsertJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/callcenter";
            String username="root";
            String password="aashi@11";

            Connection con = DriverManager.getConnection(url,username,password);

            String q = "create table sampledata(tId int(20) primary key auto_increment , From_number varchar(10) not null , Start_time datetime , End_time datetime , Duration int(20))";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);

            System.out.println("Table with name sampledata is created in the database.");

            con.close();




        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
