package com.spring_boot_restapi.Restapi.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "curr-env")
@Component
public class ConfigFile {
	private String name;
	private String server;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}

}
