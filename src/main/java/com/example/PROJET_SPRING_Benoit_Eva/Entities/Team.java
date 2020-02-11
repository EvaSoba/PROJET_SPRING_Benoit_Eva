package com.example.PROJET_SPRING_Benoit_Eva.Entities;

public class Team {
	
	public int id;
	public Area area;
	public String areaName;
	public String name;
	public String tla;
	
	public Team() {
		
	}
	
	public Team(int id, String name, String tla, String areaName) {
		this.id = id;
		this.name = name;
		this.tla = tla;
		this.areaName = areaName;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTla() {
		return tla;
	}

	public void setTla(String tla) {
		this.tla = tla;
	}
	
	
	
}
