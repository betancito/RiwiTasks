package com.riwi.Tasks;

import com.riwi.Tasks.entity.taskModel;
import com.riwi.Tasks.repository.iTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class RiwitaskApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RiwitaskApplication.class, args);
	}

	@Autowired
	private iTask taskrepo;
	@Override
	public void run(String... args) throws Exception {
//		taskModel task1 = new taskModel("Test task",
//				"a task created for a test",
//				LocalDate.now(),
//				LocalTime.now(),
//				"Pendiente");
//		taskrepo.save(task1);
//		taskModel task2 = new taskModel("Test task #2",
//				"a second task created for a test",
//				LocalDate.now(),
//				LocalTime.now(),
//				"Done");
//		taskrepo.save(task2);
	}
}
