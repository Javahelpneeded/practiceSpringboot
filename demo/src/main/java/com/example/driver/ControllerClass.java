package com.example.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@Autowired
	public static List<Patient> list;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "Hello World" + list.get(0);
	}

}
