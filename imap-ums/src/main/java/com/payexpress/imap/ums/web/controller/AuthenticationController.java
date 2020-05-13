package com.payexpress.imap.ums.web.controller;

import com.payexpress.imap.context.support.ResultBean;
import com.payexpress.imap.ums.domain.User;
import com.payexpress.imap.ums.dto.UserRegisterDto;
import com.payexpress.imap.ums.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 5/12/2020
 */
@RestController
@RequestMapping("authentication")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("check")
    public ResponseEntity<ResultBean<User>> checkAuthorization(@RequestHeader String authorization) {
        return ResponseEntity.ok(this.authenticationService.checkAuthorization(authorization));
    }

    @PostMapping("register")
    public ResponseEntity<ResultBean> register(@RequestBody UserRegisterDto userRegisterDto) {
        return ResponseEntity.ok(this.authenticationService.register(userRegisterDto));
    }
}
