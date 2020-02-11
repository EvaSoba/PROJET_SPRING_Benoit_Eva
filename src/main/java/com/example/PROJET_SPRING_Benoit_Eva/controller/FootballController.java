package com.example.PROJET_SPRING_Benoit_Eva.controller;

import java.io.IOException;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.PROJET_SPRING_Benoit_Eva.Entities.ResultFoot;
import com.example.PROJET_SPRING_Benoit_Eva.Entities.Team;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
@RestController
public class FootballController {
	
	@RequestMapping(value = "/teams", method = RequestMethod.GET)
	public List<Team> getEmployees() throws JsonParseException, JsonMappingException, IOException 
	{
		return getTeams();
	}
	
	public List<Team> getTeams() throws JsonParseException, JsonMappingException, IOException
	{
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://api.football-data.org/v2/competitions/2001/teams?season=2018";

		String token = System.getenv("token_APIFoot");
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Auth-Token", token);

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResultFoot result = restTemplate.postForObject(url, entity, ResultFoot.class);
		
		List<Team> teams = result.getTeams().stream().map(
				responseTeam -> {
					return new Team(responseTeam.getId(),responseTeam.getName(),responseTeam.getTla(), responseTeam.getName());
				}
				).collect(Collectors.toList());
				
		return teams;
	}
}
