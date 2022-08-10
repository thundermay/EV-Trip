package com.example.readconfigproperties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProfileProperties.class)
public class ReadConfigPropertiesApplication implements InitializingBean {

	private final LibraryProperties library;
	private final ProfileProperties profileProperties;

	public ReadConfigPropertiesApplication(ProfileProperties profileProperties, LibraryProperties library){
		this.library = library;
		this.profileProperties = profileProperties;
	}

	@Autowired
	private WebSite webSite;

//	public ReadConfigPropertiesApplication(ProfileProperties profileProperties){
//		this.profileProperties = profileProperties;
//	}

	public static void main(String[] args) {
		SpringApplication.run(ReadConfigPropertiesApplication.class, args);
	}

	@Override
	public void afterPropertiesSet(){
		System.out.println(profileProperties.toString());
		System.out.println(library.getLocation());
		System.out.println(library.getBooks());

		System.out.println(webSite.getUrl());//https://javaguide.cn/

	}
}
