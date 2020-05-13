package com.payexpress.imap.ums.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * 用户注册 DTO
 *
 * @author <a href="563750241@qq.com">liusc</a>
 * @date 5/11/2020
 */
@Data
public class UserRegisterDto implements Serializable {

    @NotEmpty(message = "用户名不能为空")
    private String username;
    @NotEmpty(message = "密码不能为空")
    private String password;
}
