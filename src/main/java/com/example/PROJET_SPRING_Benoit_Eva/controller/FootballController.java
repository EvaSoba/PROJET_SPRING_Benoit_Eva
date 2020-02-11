package com.example.PROJET_SPRING_Benoit_Eva.controller;

import java.net.InetSocketAddress;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FootballController {

	@RequestMapping(value = "/teams", method = RequestMethod.GET)
	public String getEmployees() 
	{
		return getTeams();
	}

	private static String getTeams()
	{
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://api.football-data.org/v2/competitions/2001/teams";

		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Auth-Token", "81133155c31245b685831bf598503680");
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(url, headers);
		String result = restTemplate.postForObject(url, entity, String.class);

		return result;

	}

}
