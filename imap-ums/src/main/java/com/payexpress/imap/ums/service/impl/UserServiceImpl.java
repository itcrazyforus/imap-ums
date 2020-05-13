package com.payexpress.imap.ums.service.impl;

import com.payexpress.imap.ums.domain.User;
import com.payexpress.imap.ums.domain.UserExample;
import com.payexpress.imap.ums.mapper.UserMapper;
import com.payexpress.imap.ums.service.UserService;
import com.payexpress.imap.ums.support.exception.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * {@link UserService} 用户服务
 *
 * @author <a href="563750241@qq.com">liusc</a>
 * @date 5/10/2020
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User selectByUsername(String username) throws UserNotFoundException {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        return this.userMapper.selectByExample(userExample).stream().findFirst().orElseThrow(UserNotFoundException::new);
    }
}
