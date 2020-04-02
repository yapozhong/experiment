package com.test.config;

import com.test.properties.Project;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({Project.Info.class, Project.class})
public class PropertiesConfig {
}
