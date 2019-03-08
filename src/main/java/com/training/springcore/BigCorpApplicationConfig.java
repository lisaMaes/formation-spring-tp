package com.training.springcore;

import com.training.springcore.service.CaptorService;
import com.training.springcore.service.CaptorServiceImpl;
import com.training.springcore.service.SiteService;
import com.training.springcore.service.SiteServiceImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BigCorpApplicationConfig {
    @Bean
   // @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Lazy
    public SiteService siteService() {
        return new SiteServiceImpl(captorService());
    }
    @Bean
    public CaptorService captorService() {
        return new CaptorServiceImpl();
    }}
