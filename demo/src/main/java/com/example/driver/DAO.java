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
import java.util.ArrayList;
import java.util.List;

@Repository
public class DAO {

    private static List<Patient> list = new ArrayList<Patient>();

    static {
        final ObjectMapper objectMapper = new ObjectMapper();
        try {
            list = objectMapper.readValue(
                    new File("/Users/christian/IdeaProjects/practiceSpringboot/demo/src/main/resources/MOCK_DATA.json"),
                    new TypeReference<List<Patient>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i=0 ; i< 10; i++)
            System.out.println(list.get(i));
    }

    public Patient getFirstPatient() throws IOException {

        return list.get(0);
    }

    public Patient getPatient(int id){
        return list.get(id);
    }
}
