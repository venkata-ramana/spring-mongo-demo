package com.demo.springmongo;

import com.demo.springmongo.enums.Gender;
import com.demo.springmongo.model.Address;
import com.demo.springmongo.model.Student;
import com.demo.springmongo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository studentRepository) {
		return args -> {
			Address address = new Address("Hyderabad", "India", "500081");
			Student student = new Student("Venkat", "Ramana", "vn@test.com", Gender.Male, address, List.of("Java", "Mongo"), BigDecimal.TEN, LocalDateTime.now());
			studentRepository.insert(student);
		};
	}
}
