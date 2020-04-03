package com.test.controller;

import com.test.properties.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExperimentController {
    @Autowired
    private Project project;
    @Value("${project.value}")
    private String value;

    @GetMapping("/project")
    @ResponseBody
    public Project project() {
        return project;
    }

    @GetMapping("/value")
    @ResponseBody
    public String value() {
        return value;
    }
}
