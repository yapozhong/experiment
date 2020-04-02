## 说明

这是一个健康检查、审计、统计和监控的框架

## 依赖

```
<!-- web服务 -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<!-- 健康健康检查，需前置web服务 http://localhost:9991/actuator/xxx -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<!-- 监控关联相关 -->
<dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-registry-prometheus</artifactId>
</dependency>
```

## 配置

`application.yml` 配置端口、开放的监控功能

## 使用

打开 http://localhost:9991/${Endpoint} 可以看到系统信息

Endpoint        | Description
----------------|---------
auditevents     | 显示应用暴露的审计事件 (比如认证进入、订单失败)
info	        | 显示应用的基本信息
health	        | 显示应用的健康状态
metrics	        | 显示应用多样的度量信息
loggers	        | 显示和修改配置的loggers
logfile	        | 返回log file中的内容(如果logging.file或者logging.path被设置)
httptrace	    | 显示HTTP足迹，最近100个HTTP request/repsponse
env	            | 显示当前的环境特性
flyway	        | 显示数据库迁移路径的详细信息
liquidbase	    | 显示Liquibase 数据库迁移的纤细信息
shutdown	    | 让你逐步关闭应用
mappings	    | 显示所有的@RequestMapping路径
scheduledtasks	| 显示应用中的调度任务
threaddump	    | 执行一个线程dump
heapdump	    | 返回一个GZip压缩的JVM堆dump