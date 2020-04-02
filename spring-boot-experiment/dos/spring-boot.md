## 依赖

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```

## 配置

1. `com.test.ExperimentApplication` 的 `@EnableAspectJAutoProxy` 开启切面编程
2. `com.test.config.PropertiesConfig` 的 `@EnableConfigurationProperties` 开启配置环境注入
3. `com.test.config.AsyncConfig` 的 `@EnableAsync` 开启异步编程，且 `getExecutorService` 配置线程池

## 使用

1. `com.test.aspect.PrintAspect` 使用了切面，更多注解详见 `org.aspectj.lang.annotation`
2. `com.test.properties.Project` 将 `application.yml` 中的配置注成一个 Bean
3. `com.test.runner.PrintRunner` 继承 `ApplicationRunner` 将在服务启动时执行
4. `com.test.service.impl.ServiceImpl#domain` 使用了 `@Async`，见会异步执行