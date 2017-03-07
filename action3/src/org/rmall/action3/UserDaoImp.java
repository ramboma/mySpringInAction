package org.rmall.action3;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */
public class UserDaoImp implements IUserDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }
    @Override
    public List<User> findAllUser() {
        String sql="select id,name from mytest";
        final List<User> listAllUser=new ArrayList<User>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                User u=new User();
                u.setId(resultSet.getInt("id"));
                u.setName(resultSet.getString("name"));
                listAllUser.add(u);
            }
        });
        return listAllUser;
    }

    @Override
    public void addUser(User user) {
       String sql="insert into mytest(id,name) values(?,?)";
        jdbcTemplate.update(sql,
                new Object[]{user.getId(), user.getName()},
                new int[]{Types.INTEGER,Types.VARCHAR});
    }

    @Override
    public int updateUser(User newUser, User oldUser) {

        String sql="update mytest set id=?,name=? where id=?";
        return jdbcTemplate.update(sql,
                new Object[]{newUser.getId(),newUser.getName(),oldUser.getId()},
                new int[]{Types.INTEGER,Types.VARCHAR,Types.INTEGER});
    }
}
