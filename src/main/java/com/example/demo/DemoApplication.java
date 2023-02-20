package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Nimantha",
						"nemo@abc.com",
						LocalDate.of(1995, Month.SEPTEMBER,2),
						27
				)
		);
	}

	@GetMapping("/list")
	public List<String> getList() {
		List<String> myList = new ArrayList<>();
		myList.add("Item 1");
		myList.add("Item 2");
		myList.add("Item 3");
		return myList;
	}

}
