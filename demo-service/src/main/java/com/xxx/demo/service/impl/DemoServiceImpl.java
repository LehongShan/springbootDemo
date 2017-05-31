package com.xxx.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.demo.mapper.DemoMapper;
import com.xxx.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper demoMapper;

	@Override
	public String hello(Long id) {
		return "Hello " + demoMapper.getById(id).getText();
	}
}
