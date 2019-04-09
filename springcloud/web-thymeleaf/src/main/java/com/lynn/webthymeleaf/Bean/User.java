package com.lynn.webthymeleaf.Bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User  implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;
}
