package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

@Configuration
@EnableAsync
public class AsyncConfig {
    @Bean
    public ExecutorService getExecutorService() {
        return new ForkJoinPool
                (Runtime.getRuntime().availableProcessors(),
                        ForkJoinPool.defaultForkJoinWorkerThreadFactory,
                        null, true);
    }
}
