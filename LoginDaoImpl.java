package com.Student.Dao;

import com.Student.Bean.User;

/**
 * @ClassName: LoginDaoImpl
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/20 15:42
 * @URL：https://github.com/GaoHaiNB
 */
public class LoginDaoImpl implements LoginDao {
    @Override
    public User LoginDao(User u) {
        int u_id = u.getU_id();
        String u_pwd = u.getU_pwd();

        User user = new User(1001, "王冰冰", "000000", "17564304371", 1, 0);
        return null;
    }
}
