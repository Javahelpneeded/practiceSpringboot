package com.example.driver;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Repository
public class DAO {
	

    // Getting Patient information from a file instead of a database for right now, will need to create a new class for dao
    private List<Patient> list;

    public DAO() throws JsonParseException, JsonMappingException, IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        list = objectMapper.readValue(
                new File("MOCK_DATA.json"),
                new TypeReference<List<Patient>>(){});

        for(int i=0 ; i< 10; i++)
            System.out.println(list.get(i));
    }
    //----------------------------------------------------------------------------------------------------------

    public Patient getFirstPatient() throws IOException {
        return list.get(0);
    }
}
