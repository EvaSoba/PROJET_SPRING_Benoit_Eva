package com.example.PROJET_SPRING_Benoit_Eva.services;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.client.RestTemplate;

public class TeamService {

	private static void getTeams(@RequestHeader("X-Auth-Token") String header)
	{
		
	    final String uri = "http://api.football-data.org/v2/competitions/2001/teams";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    System.out.println(result);
	}
}
