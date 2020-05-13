package com.payexpress.imap.ums.service;

import com.payexpress.imap.context.support.ResultBean;
import com.payexpress.imap.ums.domain.User;
import com.payexpress.imap.ums.dto.UserRegisterDto;

/**
 * todo: add comment here
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 5/13/2020
 */
public interface AuthenticationService {
    ResultBean<User> checkAuthorization(String authorization);

    ResultBean register(UserRegisterDto userRegisterDto);
}
