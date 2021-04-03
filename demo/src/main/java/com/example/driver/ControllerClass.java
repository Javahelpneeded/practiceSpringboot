package com.example.driver;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerClass {

	@Autowired
	private ServiceClass serviceClass;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String test() throws IOException {
		return "" + serviceClass.getFirstPatient();
	}

	@GetMapping("/patient/{id}")
	public String getFirstPatient(@PathVariable int id){
		return serviceClass.getPatient(id).toString();
	}
}
