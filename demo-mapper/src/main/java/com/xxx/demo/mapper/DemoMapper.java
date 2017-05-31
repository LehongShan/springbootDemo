package com.xxx.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.xxx.demo.model.Demo;

@Mapper
public interface DemoMapper { 
	Demo getById(Long id);
}
