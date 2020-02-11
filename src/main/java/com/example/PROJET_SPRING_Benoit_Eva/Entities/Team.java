package com.example.PROJET_SPRING_Benoit_Eva.Entities;

public class Team {
	
	public int id;
	public Object area;
	public String name;
	public String tla;
	
	public Team() {
		
	}
	
	public Team(int id, String name, String tla) {
		this.id = id;
		this.name = name;
		this.tla = tla;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Object getArea() {
//		return area;
//	}
//
//	public void setArea(Object area) {
//		this.area = area;
//	}

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
