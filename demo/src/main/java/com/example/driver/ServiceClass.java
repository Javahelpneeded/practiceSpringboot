package com.example.driver;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class ServiceClass {

    @Autowired
    private DAO dao;


    public Patient getFirstPatient() throws IOException {
        return dao.getFirstPatient();
    }

    public Patient getPatient(int id){
        return dao.getPatient(id);
    }
}
