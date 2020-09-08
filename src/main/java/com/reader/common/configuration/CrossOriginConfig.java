package com.reader.common.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
 *AJAX请求跨域
 * @Author ${USER}
 * @Date ${DATE} ${TIME}
 */
@Configuration
public class CrossOriginConfig implements WebMvcConfigurer {
    static final String ORIGINS[] = new String[] {"GET","POST","PUT","DELETE"};
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                //.allowedOrigins("http://localhost:8085")
                .allowedOrigins("*")  //支持的域
                .allowedHeaders("*")
//                .allowedMethods("*")
                .allowedMethods(ORIGINS)
                .allowCredentials(true)
                .maxAge(3600);   //请求的有效期
    }
}
