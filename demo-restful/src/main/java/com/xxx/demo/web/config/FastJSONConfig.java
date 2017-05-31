package com.xxx.demo.web.config;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 配置fastjson替换jackson
 */
@Configuration
public class FastJSONConfig {

	@Bean
	public HttpMessageConverters customConverters() {
		HttpMessageConverter<?> additional = new FastJsonHttpMessageConverter();
		return new HttpMessageConverters(additional);
	}

}
