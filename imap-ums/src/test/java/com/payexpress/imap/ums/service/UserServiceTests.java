package com.payexpress.imap.ums.service;

import com.payexpress.imap.ums.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * {@link UserService} unit test
 *
 * @author <a href="563750241@qq.com">liusc</a>
 * @date 5/10/2020
 */
@SpringBootTest
public class UserServiceTests {

    @Mock
    private UserService userService;

    @BeforeEach
    public void prepare() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("18080188107");
        when(userService.getUser(1L)).thenReturn(user);

        assertEquals(userService.getUser(1L).getId(), user.getId());
    }

}
