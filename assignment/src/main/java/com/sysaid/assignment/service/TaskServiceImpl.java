package com.sysaid.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sysaid.assignment.domain.Task;

@Service
public class TaskServiceImpl implements ITaskService {

    @Value( "${external.boredapi.baseURL}" )
    private  String baseUrl;
    public List<Task> user;

    int count = 10;

    public ResponseEntity<Task> getRandomTask(){
        String endpointUrl = String.format("%s/activity", baseUrl);
        

        RestTemplate template = new RestTemplate();
        ResponseEntity<Task> responseEntity = template.getForEntity( endpointUrl, Task.class);

        return responseEntity;
    }
    
    public ResponseEntity<List<Task>> getUncompletedTasks(String user, String type, int count) {
        String endpointUrl = String.format("%s/activity", baseUrl);

    
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Task>> responseEntity = restTemplate.exchange(
        endpointUrl,
        HttpMethod.GET,
        null,
        new ParameterizedTypeReference<List<Task>>() {}
    );
    return responseEntity;
    }
}