package com.example.PROJET_SPRING_Benoit_Eva.Entities;

import java.util.List;

public class ResultFoot {

	public String count;
	public Object filters;
	public Object competition;
	public Object season;
	public List<Team> teams;
	
	public ResultFoot() {
		
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public Object getFilters() {
		return filters;
	}

	public void setFilters(Object filters) {
		this.filters = filters;
	}

	public Object getCompetition() {
		return competition;
	}

	public void setCompetition(Object competition) {
		this.competition = competition;
	}

	public Object getSeason() {
		return season;
	}

	public void setSeason(Object season) {
		this.season = season;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	
	
	
	
	
}
