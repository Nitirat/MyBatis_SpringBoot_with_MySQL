package com.example.MyBatisSpringBoot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.MyBatisSpringBoot.domain.Task;

@Mapper
public interface TaskMapper {

	@Select("select * from todolist.tasks")
	List<Task> findAll();

}
