package com.lynn.webthymeleaf.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lynn.webthymeleaf.Bean.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
