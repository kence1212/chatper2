package com.smart.dao;

import com.smart.domain.Loginlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginLogDao {

    private JdbcTemplate jdbcTemplate;

    //保存登录日志
    private final static String INSERT_LOG_SQL = "INSERT INTO t_login_log(user_id,ip,login_datetime)" +
            "VALUES(?,?,?)";
    public void insertLoginLog(Loginlog loginLog){
        Object[] args = {loginLog.getUserId(),loginLog.getIp(),loginLog.
                getLoginDate()};

        jdbcTemplate.update(INSERT_LOG_SQL,args);
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
