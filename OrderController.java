package com.tnsif.Shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.Shopping.entity.Order;
import com.tnsif.Shopping.repository.OrderRepository;

@RestController
public class OrderController {

	public class EmployeeController {
		@Autowired
		OrderRepository repo;

		@PostMapping("/employee")
		public Order addEmployee(@RequestBody Order e) {
			return repo.save(e);

		}

		@GetMapping("/employee")
		public List<Order> getEmployees()

		{

			return repo.findAll();
		}

		@GetMapping("/employee/{id}")
		public Order getOwnerById(Integer id) {
			return repo.findById(id).get();

		}

	}
}
