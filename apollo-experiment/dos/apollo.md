## 说明

apollo 是配置中心微服务。

## 依赖

```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-context</artifactId>
    <version>2.1.3.RELEASE</version>
</dependency>

<!-- Apollo 客户端 -->
<dependency>
    <groupId>com.ctrip.framework.apollo</groupId>
    <artifactId>apollo-client</artifactId>
    <version>1.3.0</version>
</dependency>

```

## 配置

1. `application.yml` 配置 `appId` 和 `Apollo Meta Server`
2. `com.test.config.ApolloPropertiesRefresher`, 
继承 `ApplicationContextAware` 可获取 `ApplicationContext` 对象；
`onChange` 方法配合 `@ApolloConfigChangeListener` 
可以使 `@ConfigurationProperties` 注入的配置能自动刷新。
3. `@Value` 注入的配置不用特殊实现即可自动刷新。

## 使用

在 `apollo-portal` 服务上（web图像界面）进行配置后发布。