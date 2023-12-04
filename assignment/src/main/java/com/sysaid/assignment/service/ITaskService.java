package com.sysaid.assignment.service;

import org.springframework.http.ResponseEntity;

import com.sysaid.assignment.domain.Task;

public interface ITaskService {
    public ResponseEntity<Task> getRandomTask();
    }
