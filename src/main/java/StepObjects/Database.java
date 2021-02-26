package StepObjects;

import java.sql.*;

public class Database {

    public static Connection connect() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=users;user=TestAutomation;password=TestAutomation123";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
            System.out.println("Connected to Microsoft SQL Server");
        } catch (SQLException throwables) {
            System.out.println("Oops, there's an error");
            throwables.printStackTrace();
        }
        return conn;
    }

    public void insertUser(String firstName,String lastName, String phone,String password,String address, String email, String state,String city, int zip) {

        String sql = " insert into users\n" +
                "(firstName,lastName,phone,password,address,email,state,city,zip)\n" +
                "  values(?,?,?,?,?,?,?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            // set parameters for statement
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, phone);
            pstmt.setString(4, password);
            pstmt.setString(5, address);
            pstmt.setString(6, email);
            pstmt.setString(7, state);
            pstmt.setString(8, city);
            pstmt.setInt(9, zip);

            pstmt.executeUpdate();
            conn.commit();
            System.out.println("save user");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ResultSet selectUser() throws SQLException {

        String sql = "SELECT TOP 1 *\n" +
                "FROM users\n" +
                "ORDER BY id DESC";
        ResultSet rs = null;

        try{
            Connection conn = connect();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }
}
