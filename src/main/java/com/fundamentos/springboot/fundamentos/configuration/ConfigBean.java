package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImpelementTwo();
    }

    @Bean
    public MyOperation beanOperationTwo(){
        return new MyOperationImpl();
    }

    @Bean
    public MyBeanWithDependencies beanOperationDepedency(MyOperation myOperation){
        return new MyBeanImplDependency(myOperation);
    }
}