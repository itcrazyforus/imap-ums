package com.payexpress.imap.ums.web.controller;

import com.payexpress.imap.ums.domain.User;
import com.payexpress.imap.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link User} Rest API
 *
 * @author <a href="563750241@qq.com">liusc</a>
 * @date 5/10/2020
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUser(1L));
    }
}
