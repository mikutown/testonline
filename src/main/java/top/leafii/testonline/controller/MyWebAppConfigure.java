package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyWebAppConfigure implements WebMvcConfigurer {
    /**上传地址*/
    @Value("${sysUploadFileDir}")
    private String filePath;
    /**显示相对地址*/
    @Value("${sysUploadFileRelativeDir}")
    private String fileRelativePath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(fileRelativePath).
                addResourceLocations("file:/" + filePath);
    }
}
