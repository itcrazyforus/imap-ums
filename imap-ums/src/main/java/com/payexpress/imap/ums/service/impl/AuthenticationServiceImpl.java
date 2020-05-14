package com.payexpress.imap.ums.service.impl;

import com.payexpress.imap.context.support.ResultBean;
import com.payexpress.imap.ums.domain.User;
import com.payexpress.imap.ums.dto.UserRegisterDto;
import com.payexpress.imap.ums.mapper.UserMapper;
import com.payexpress.imap.ums.service.AuthenticationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * {@link AuthenticationService} 认证服务
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 5/12/2020
 */
@Service
@Slf4j
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultBean<User> checkAuthorization(String authorization) {
        log.info("验证登录的有效性，通过 authorization 获取到用户的信息");
        User user = new User();
        user.setId(1L);
        user.setUsername("18080188107");
        return new ResultBean<>(user);
    }

    @Override
    public ResultBean register(UserRegisterDto userRegisterDto) {
        log.info("注册用户");
        User user = new User();
        user.setUsername(userRegisterDto.getUsername());
        user.setPassword(userRegisterDto.getPassword());
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        int rows = this.userMapper.insertSelective(user);
        if (rows < 1) {
            // TODO：不建议直接抛出 RuntimeException
            throw new RuntimeException("注册失败");
        }
        return ResultBean.buildSuccessResult();
    }
}
