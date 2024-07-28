package com.spring_boot_restapi.Restapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_restapi.Restapi.Bean.ConfigFile;

@RestController
public class ConfigFileController {
	@Autowired
	private ConfigFile config;
	//http://localhost:8081/configfiles
	@RequestMapping("/configfiles")
	public List<String> display(){
		
		return Arrays.asList(config.getName(),config.getServer());
	}
	

}
