package com.example.readconfigproperties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:website.properties")
@Getter
@Setter

/**
 * @BelongsProject: read-config-properties
 * @BelongsPackage: com.example.readconfigproperties
 * @Author: Simon.M
 * @CreateTime: 2022-08-09  15:01
 * @Description: TODO
 * @Version: 1.0
 */
public class WebSite {
    @Value("${url}")
    private String url;
}
