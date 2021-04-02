package com.example.driver;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@Autowired
	private DAO dao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String test() throws IOException {
		return "" + dao.getFirstPatient();
	}

}
