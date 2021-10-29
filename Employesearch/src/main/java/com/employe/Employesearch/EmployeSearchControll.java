package com.employe.Employesearch;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeSearchControll {
	
	private EmployeModel emp;
	private final String url_name ="http://localhost:8082/empdtl";
	@GetMapping("/")
	public String getSearchEmploye(){
		
		HttpHeaders header=new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Object> requestEnt=new HttpEntity(header);
		
		RestTemplate temp=new RestTemplate();
		ResponseEntity<String> resp=temp.exchange(url_name+"empdtl",HttpMethod.GET,requestEnt,String.class);
		System.out.println("---->"+resp.getStatusCode());
		return resp.getBody();
		//return temp.getForObject(url_name,EmployeModel.class);
		//temp.getForObject(null, nullurl:http://localhost:8082/empdtl,emp)
		//return "Welcome to Search";
	}
	
	@GetMapping("/hello")
	public String sayHellow()
	{
		return "welcome ";
	}

}
