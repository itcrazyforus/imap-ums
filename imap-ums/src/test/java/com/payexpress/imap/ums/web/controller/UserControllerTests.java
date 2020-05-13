package com.payexpress.imap.ums.web.controller;

import com.payexpress.imap.ums.domain.User;
import com.payexpress.imap.ums.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *{@link UserController} 单元测试
 *
 * @author <a href="563750241@qq.com">liusc</a>
 * @date 5/10/2020
 */
@WebMvcTest(UserController.class)
@AutoConfigureMybatis
public class UserControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void testGetUser() throws Exception {
        User user = new User();
        user.setId(1L);
        user.setUsername("18080188107");

        given(userService.getUser(1L))
                .willReturn(user);
        mockMvc.perform(get("/user/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andDo(print());
    }

}
