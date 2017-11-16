package com.example.MyBatisSpringBoot.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyBatisSpringBoot.domain.Task;
import com.example.MyBatisSpringBoot.mapper.TaskMapper;

@RestController
public class TaskController {
	
	private TaskMapper taskMapper;
	
	public TaskController(TaskMapper taskMapper) {
		this.taskMapper = taskMapper;
	}
	
	@GetMapping({"/", "/tasks"})
	public List<Task> getAllTask(){
		return taskMapper.findAll();
	}

}
