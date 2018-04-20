package foo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import foo.Model.User;
public class UserDaoImpl implements IUserDAO {
  @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;
  
  public void register(User user) {
    String sql = "insert into users values(?,?,?,?,?,?,?)";
    jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
    user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
    }
   
  }
  class UserMapper implements RowMapper<User> {
  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();
    user.setUsername(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    user.setFirstname(rs.getString("firstname"));
    user.setLastname(rs.getString("lastname"));
    user.setEmail(rs.getString("email"));
    user.setAddress(rs.getString("address"));
    user.setPhone(rs.getInt("phone"));
    return user;
  }
}
