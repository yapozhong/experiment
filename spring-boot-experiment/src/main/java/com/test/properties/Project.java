package com.test.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix ="project")
@Data
public class Project {
    @Autowired
    private Info info;
    private List<String> list;
    private Map<String, String> map;

    @Data
    @ConfigurationProperties(prefix ="project.info")
    public class Info{
        private int variable1;
        private int variable2;
    }
}
