package com.test.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum UserStatusEnum {
    INIT("1", "初始状态"),
    ENABLE("2", "启用状态");

    private String code;
    private String desc;

    UserStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static UserStatusEnum getTarget(String code) {
        return Arrays.stream(values())
                .filter(e -> e.code.equals(code))
                .findFirst().orElse(null);
    }
}
