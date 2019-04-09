package com.lynn.webthymeleaf.Service;

import com.lynn.webthymeleaf.Bean.User;

public interface UserService {
    Object listAll(int page, int size);
    int insert(User user);
    int remove(Integer userId);
    int update(User user);
}
