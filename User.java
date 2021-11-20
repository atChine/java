package com.Student.Bean;

import java.security.PrivateKey;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/20 15:12
 * @URL：https://github.com/GaoHaiNB
 */
public class User {
    private int u_id;
    private String u_name;
    private String u_pwd;
    private String u_phone;
    private int u_role;
    private int u_isdelet;

    public User() {
    }

    public User(int u_id, String u_name, String u_pwd, String u_phone, int u_role, int u_isdelet) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_pwd = u_pwd;
        this.u_phone = u_phone;
        this.u_role = u_role;
        this.u_isdelet = u_isdelet;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public int getU_role() {
        return u_role;
    }

    public void setU_role(int u_role) {
        this.u_role = u_role;
    }

    public int getU_isdelet() {
        return u_isdelet;
    }

    public void setU_isdelet(int u_isdelet) {
        this.u_isdelet = u_isdelet;
    }
}
