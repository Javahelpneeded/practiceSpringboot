package com.example.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.driver.ControllerClass;
import com.example.driver.Patient;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@ComponentScan(basePackageClasses=ControllerClass.class)
public class DemoApplication {
	
    @Autowired
    public static List<Patient> list;
    
    
	public static void p() throws JsonParseException, JsonMappingException, IOException {
		final ObjectMapper objectMapper = new ObjectMapper();
		list = objectMapper.readValue(
		        new File("MOCK_DATA.json"), 
		        new TypeReference<List<Patient>>(){});

		for(int i=0 ; i< 10; i++)
		 System.out.println(list.get(i));
	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(DemoApplication.class, args);
		
		p();
		
		
		
	}

}
