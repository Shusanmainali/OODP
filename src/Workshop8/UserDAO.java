package Workshop8;

import java.sql.*;

public class UserDAO {

    public static void fetchUserByName(String name) {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE name = ?"
            );
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Password: " + rs.getString("password"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

