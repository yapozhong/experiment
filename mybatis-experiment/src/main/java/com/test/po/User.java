package com.test.po;

import com.test.enums.UserStatusEnum;
import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private UserStatusEnum status;
}
