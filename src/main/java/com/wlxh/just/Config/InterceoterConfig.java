package com.wlxh.just.Config;

import com.wlxh.just.interceoter.AdminInterceoter;
import com.wlxh.just.interceoter.LoginInterceoter;
import com.wlxh.just.interceoter.SuperInterceoter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置    +     前后端分离拦截器
 * @author:baibaiwuchang
 * @Data:2019/2/11 13:51
 */
@Configuration
public class InterceoterConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceoter()).addPathPatterns("/api/v1/user/*/**");
        registry.addInterceptor(new AdminInterceoter()).addPathPatterns("/api/v1/user/admin/*/**");
        registry.addInterceptor(new SuperInterceoter()).addPathPatterns("/api/v1/user/super/*/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT","OPTIONS")
                .maxAge(3600);
    }

}
