package com.lynn.webthymeleaf.Service.Impl;

import com.lynn.webthymeleaf.Bean.User;
import com.lynn.webthymeleaf.Mapper.UserMapper;
import com.lynn.webthymeleaf.Service.UserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;

/**
 * UserServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/2/10 1:31
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Object listAll(int page, int size) {

        Page pageObj = new Page(page, size);
        return userMapper.selectPage(pageObj, null);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int remove(Integer userId) {
        return userMapper.deleteById(userId);
    }

    @Override
    public int update(User user) {
        return userMapper.updateById(user);
    }
}
