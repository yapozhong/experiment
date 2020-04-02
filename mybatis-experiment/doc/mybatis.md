## 依赖

```
<!-- mybatis -->
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>1.3.2</version>
</dependency>
<!-- mysql 驱动 -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.15</version>
</dependency>
```

## 配置

在 `application.yml` 中配置 mybatis 和数据库链接

## 使用

1. `com.test.dao.UserDao` 添加注解 `@Mapper` 标记为一个 Dao。
2. `com.test.dao.handlers.EnumHander` 是 `com.test.enums.UserStatusEnum` 的 mybatis 映射器，
并添加注解 `@MappedTypes` 将 `UserStatusEnum` 加为 mybatis 映射类型。 
3. `UserMapper.xml` 是 mybatis 的 sql 脚本。