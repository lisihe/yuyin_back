package me.runfang.yuyin.yuyinback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("me.runfang.yuyin.yuyinback.dao")
public class YuyinBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(YuyinBackApplication.class, args);
	}
}
