package org.rmall.action3;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
}
