package com.payexpress.imap.ums.service;


import com.payexpress.imap.ums.domain.User;
import com.payexpress.imap.ums.support.exception.UserNotFoundException;

/**
 * 用户服务
 *
 * @author <a href="563750241@qq.com">liusc</a>
 * @date 5/10/2020
 */
public interface UserService {

    User getUser(Long id);

    User selectByUsername(String username) throws UserNotFoundException;

}
