package com.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "实验Api")
public class ExperimentController {

    @GetMapping("/json")
    @ResponseBody
    @ApiOperation("json")
    public String json(@ApiParam("参数") String param) {
        return param;
    }

    @GetMapping("/view")
    @ApiOperation("试图接口")
    public String view() {
        return "view";
    }
}
