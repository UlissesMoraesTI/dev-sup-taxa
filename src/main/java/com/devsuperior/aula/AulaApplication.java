package com.devsuperior.aula;

import com.devsuperior.aula.entities.Employee;
import com.devsuperior.aula.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Autowired
	public SalaryService salaryService;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("JJ", 4000.00);
		System.out.println(salaryService.netSalary(employee));
	}
}
