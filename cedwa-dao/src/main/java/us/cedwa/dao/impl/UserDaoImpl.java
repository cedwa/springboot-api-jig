package us.cedwa.dao.impl;

import us.cedwa.dao.entity.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by cedwa on 8/17/15.
 */
public class UserDaoImpl extends AbstractDaoImpl<User> {
    private static final String SQL_FIND_BY_GUID = "Select id, name from user where id = :id";

    public List<User> find(String id) {
        SqlParameterSource namedParameters = new MapSqlParameterSource("id", id);
        List<User> users = this.getJdbcTemplate().query(SQL_FIND_BY_GUID, namedParameters, new RowMapper() {
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = mapResultSetRow(rs, rowNum);
                return user;
            }
        });
        return users;
    }

    public User save(User entity) {
        return null;
    }

    public User delete(String id) {
        return null;
    }
    public User delete(User entity) {
        return null;
    }

    protected User mapResultSetRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        return user;
    }
}
