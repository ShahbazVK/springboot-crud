package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args->{
			Student shahbaz = new Student("Shahbaz", "shahbazalivk@gmail.com", LocalDate.of(2000,Month.JANUARY,6));
			Student shahzad = new Student("Shahzad", "shahzadbahadur1998@gmail.com", LocalDate.of(2000,Month.NOVEMBER,6));
			
			repository.saveAll(List.of(shahbaz,shahzad));
		};
				
	};
}
