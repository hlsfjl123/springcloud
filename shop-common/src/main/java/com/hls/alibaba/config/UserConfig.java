package com.hls.alibaba.config;

import com.hls.alibaba.vo.UserBeanFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class UserConfig {
    @Bean
    public UserBeanFactory user(){
        return new UserBeanFactory();
    }
}
