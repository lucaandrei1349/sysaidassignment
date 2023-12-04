package com.sysaid.assignment.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sysaid.assignment.domain.Task;
import com.sysaid.assignment.service.TaskServiceImpl;


@RestController
public class TaskController {

	private final TaskServiceImpl taskService;

	public TaskController(TaskServiceImpl taskServiceImpl) {
		this.taskService = taskServiceImpl;
	}

@GetMapping("/uncompleted-tasks/{user}")
	public ResponseEntity<List<Task>> getUncompletedTasks(
    @PathVariable ("user") String user,
    @RequestParam(name = "type", required = false) String type) {

	int count = 10;

    List<Task> uncompletedTasks = (List<Task>) taskService.getUncompletedTasks(user, type, count);

    if (uncompletedTasks != null && !uncompletedTasks.isEmpty()) {
        return new ResponseEntity<>(uncompletedTasks, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

	@RequestMapping("/task-of-the-day")
	public ResponseEntity<Task> getTaskOfTheDay(){
		//example of service use
		return taskService.getRandomTask();
	}

}

