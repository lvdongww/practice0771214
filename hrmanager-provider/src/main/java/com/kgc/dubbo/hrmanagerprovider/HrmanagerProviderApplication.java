package com.kgc.dubbo.hrmanagerprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kgc.dubbo.hrmanagerprovider.mapper")
@SpringBootApplication
public class HrmanagerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmanagerProviderApplication.class, args);
	}

}
