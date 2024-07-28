package com.spring_boot_restapi.Restapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_restapi.Restapi.Bean.Game;

@RestController
public class GameController {
	//http://localhost:8081/games
	@RequestMapping("/games")
	public List<Game> getAllgame(){
		return Arrays.asList(
                             new Game(1,"Switch","Yamada"),
                             new Game(2,"Sport","Furusato"),                             
                             new Game(3,"Tennis","Toyoda"),
                             new Game(4,"CarRaceeeefff","Yodobashi"));
	}

}
