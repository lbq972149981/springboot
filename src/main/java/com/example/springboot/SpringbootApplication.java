package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootApplication.class);
		builder.bannerMode(Banner.Mode.OFF).run(args);
//		SpringApplication.run(SpringbootApplication.class, args);
	}
	@Value(value = "${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;
	@Value("${book.pinyin}")
	private String bookPinYin;
	@Autowired
	private BookBean bookBean;
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
		return bookBean.getAuthor()+"--"+bookBean.getName()+"--"+bookBean.getPrice();
	}
}
