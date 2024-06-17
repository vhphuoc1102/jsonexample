package com.phuocvh.jsonexample;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.phuocvh.jsonexample.entities.Meibo;
import com.phuocvh.jsonexample.entities.MeiboData;
import com.phuocvh.jsonexample.entities.Pay;
import com.phuocvh.jsonexample.entities.PayData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

@SpringBootApplication
public class JsonExampleApplication {

	public static void main(String[] args) throws IOException {
		Meibo meibo = new Meibo(1, "meibo", LocalDateTime.now());
		Pay pay = new Pay(1, "payName", LocalDateTime.now());

		MeiboData meiboData = new MeiboData(meibo);
		PayData payData = new PayData(pay);

		meiboData.getProperties().put("pay", payData);
		ObjectMapper objectMapper = new ObjectMapper();
		String test = objectMapper.writeValueAsString(meiboData);

    System.out.println(test);
	}

}
