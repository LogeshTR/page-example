package com.pagination.pagination;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pagination.pagination.domain.Student;
import com.pagination.pagination.repo.StudentRepository;

@SpringBootApplication
public class PaginationApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = new ArrayList<>();
		students.add(Student.builder().name("Alice").city("UK").build());
		students.add(Student.builder().name("Ganesh").city("UK").build());
		students.add(Student.builder().name("ram").city("Scotland").build());
		students.add(Student.builder().name("Rex").city("US").build());
		students.add(Student.builder().name("Doremon").city("China").build());
		students.add(Student.builder().name("Dhina").city("India").build());
		students.add(Student.builder().name("Ash").city("Thailand").build());
		students.add(Student.builder().name("Raju").city("Scotland").build());
		students.add(Student.builder().name("Shinchan").city("China").build());
		students.add(Student.builder().name("Johnny Bravo").city("US").build());
		students.add(Student.builder().name("Rajesh").city("US").build());
		students.add(Student.builder().name("Korra").city("China").build());
		students.add(Student.builder().name("Katara").city("China").build());
		students.add(Student.builder().name("Aang").city("China").build());
		students.add(Student.builder().name("SpongeBob").city("US").build());
		students.add(Student.builder().name("Tom").city("India").build());
		students.add(Student.builder().name("Jerry").city("India").build());
		students.add(Student.builder().name("Mickey Mouse").city("Thailand").build());
		students.add(Student.builder().name("Pooh").city("Thailand").build());
		students.add(Student.builder().name("raghul").city("China").build());
		students.add(Student.builder().name("Akash").city("India").build());
		students.add(Student.builder().name("Rajesh").city("Thailand").build());
		students.add(Student.builder().name("Rudhra").city("Scotland").build());
		students.add(Student.builder().name("Sachin").city("China").build());
		students.add(Student.builder().name("Bravo").city("US").build());
		students.add(Student.builder().name("Logesh").city("US").build());
		students.add(Student.builder().name("Raghuk").city("China").build());

		studentRepository.saveAll(students);
	}
}