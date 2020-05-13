package com.payexpress.imap.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.payexpress.imap.ums.mapper")
@EnableDiscoveryClient
@EnableTransactionManagement
public class ImapUmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImapUmsApplication.class, args);
	}

}
