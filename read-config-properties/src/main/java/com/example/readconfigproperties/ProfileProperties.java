package com.example.readconfigproperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import org.springframework.stereotype.Component;

//导入校验Email/NotEmpty
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
@Component
@ConfigurationProperties("my-profile")

@Validated

//通过@ConfigurationProperties读取并校验
public final class ProfileProperties {

    @NotEmpty
    private String name;

    @Email
    @NotEmpty
    private String email;

    //配置文件中没有读取到的话就用默认值
    private Boolean handsome = Boolean.TRUE;

}
