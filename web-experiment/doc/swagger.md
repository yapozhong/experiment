## 说明
这是一个自动生成接口文档的框架

## 依赖

```
<!-- web服务 -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<!-- swagger2 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
</dependency>
<!-- ui -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
</dependency>
```

## 配置

1. `com.test.config.SwaggerConfig` 中，
用 `@EnableSwagger2` 开启功能，
在 `createRestApi` 中创建相关配置类
2. `com.test.config.WebConfigurer#addResourceHandlers` 中，
添加静态文件 `swagger-ui.html` 提供页面

## 使用

例如 `com.test.controller.ExperimentController` 中
的 `@Api`、`@ApiOperation`、`@ApiParam` 等注解，是用来对接口进行说明的。

更多注解见 `io.swagger.annotations` 包。

http://localhost:9990/swagger-ui.html 可以看到接口文档
