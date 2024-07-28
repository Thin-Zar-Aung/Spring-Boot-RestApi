package com.spring_boot_restapi.Restapi.Bean;


public class Game {
  private int id;
  private String name;
  private String developer;
public Game(int id, String name, String developer) {
	super();
	this.id = id;
	this.name = name;
	this.developer = developer;
}
@Override
public String toString() {
	return "Game [id=" + id + ", name=" + name + ", developer=" + developer + "]";
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getDeveloper() {
	return developer;
}
}
