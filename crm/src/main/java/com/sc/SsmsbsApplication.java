package com.sc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sc.mapper")	//扫描该包下所有的maaper接口生成bean对象
public class SsmsbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmsbsApplication.class, args);
	}

}
