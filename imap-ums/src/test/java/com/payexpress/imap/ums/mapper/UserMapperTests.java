package com.payexpress.imap.ums.mapper;

import com.payexpress.imap.ums.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * {@link UserMapper} unit test
 *
 * @author <a href="563750241@qq.com">liusc</a>
 * @date 5/10/2020
 */
@SpringBootTest
@MybatisTest
@Slf4j
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserMapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsertSelective() {

    }

    @Test
    public void testInsert() {

    }

    @Test
    public void testSelectByUsername() {
        User user = userMapper.selectByUsername("18080188107");
        assertEquals("18080188107", user.getUsername());
    }

}
