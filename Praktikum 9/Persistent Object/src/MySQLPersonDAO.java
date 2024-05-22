//import java.sql.*;
//public class MySQLPersonDAO implements PersonDAO{
//    public void savePerson(Person person) throws Exception{
//        String name = person.getName();
//        //membuat koneksi, nama db, user, password menyesuaikan
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo","root","05Dr2004");
//
//        //kerjakan mysql query
//        String query = "INSERT INTO person(name) VALUES ('"+ name +"')";
//        System.out.println(query);
//        Statement s = con.createStatement();
//        s.executeUpdate(query);
//        //Tutup koneksi database
//        con.close();
//    }
//}
