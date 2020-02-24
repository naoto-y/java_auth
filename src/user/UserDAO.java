package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.Connecter;

public class UserDAO {

    public UserDTO getUserDataById(int id) {
        UserDTO userDTO = new UserDTO();

        try(Connection conn = Connecter.DBConnection()){
            String sql = "SELECT * FROM user_data WHERE id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rset = ps.executeQuery();
            rset.next();
            userDTO.setId(rset.getInt("id"));
            userDTO.setName(rset.getString("name"));
            userDTO.setFlavor(rset.getString("flavor"));

            ps.close();
            conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return userDTO;
    }

    public int getUserIdByNameAndPass(String name, String pass) {
        int userId = 0;

        try(Connection conn = Connecter.DBConnection()){
            String sql = "SELECT id FROM user_data WHERE name = ? AND password = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pass);

            ResultSet rset = ps.executeQuery();
            rset.next();
            userId = rset.getInt("id");

            ps.close();
            conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return userId;
    }

    public void addUser(String name, String pass, String flavor) {
        try(Connection conn = Connecter.DBConnection()){
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO user_data VALUES (null,?,?,?,0,now(),now())";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, flavor);

            ps.executeUpdate();
            conn.commit();

            ps.close();
            conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return;
    }
}
