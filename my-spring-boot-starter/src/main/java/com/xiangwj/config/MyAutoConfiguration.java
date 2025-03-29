package com.xiangwj.config;

import com.xiangwj.properties.MyProperties;
import com.xiangwj.service.MyService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


@AutoConfiguration
@ConditionalOnClass(MyService.class)
@EnableConfigurationProperties(MyProperties.class)
public class MyAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(MyService.class)

    public MyService myService(MyProperties myProperties) {
        return new MyService(myProperties.getPerfix(), myProperties.getSurfix());
    }
}
