package dao;

import model.User;

/**
 * user:ouym
 * date: 2015/7/31
 * time: 11:43
 */
public interface UserDAO {
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
}
