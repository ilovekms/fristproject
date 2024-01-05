package com.example.fristproject.conf;

import com.example.fristproject.interceptor.CustomInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
//@ComponentScan(basePackages={"com.shlee.toy1.common.components"})
@ComponentScan
public class MvcConfiguration implements WebMvcConfigurer  {

    //@Autowired
    //private CustomInterceptor  customInterceptor;

    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/templates/","classpath:/static/")
                .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
    }

    @Override
    public void addInterceptors (InterceptorRegistry registry) {
        registry.addInterceptor( new CustomInterceptor())
                .addPathPatterns("/*")
                .addPathPatterns("/api/*")
                .excludePathPatterns("/notice/noticeList");
    }

}
