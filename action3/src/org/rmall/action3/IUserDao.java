package org.rmall.action3;

import java.util.List;

/**
 * Created by Administrator on 2017/3/7.
 */
public interface IUserDao {
    public List<User> findAllUser();
    public void addUser(User user);
    public int updateUser(User oldUser,User newUser);
}
