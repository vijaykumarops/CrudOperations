package com.example.CrudOperations.controller;

import com.example.CrudOperations.entity.Customer;
import com.example.CrudOperations.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
      @Autowired
      public CustomerService customerservice;

      @GetMapping("/customers")
      private List<Customer> getAllCustomers(){

          return customerservice.getAllCustomers();
      }
      @GetMapping("/{getbyid}")
      private Customer getCustomer(@PathVariable("id") int id){

          return customerservice.getById(id);
      }
      @PostMapping("/customer")
      public Customer saveCustomer(@RequestBody Customer customer){

           customerservice.save(customer);

           return customer;
      }
      @PutMapping("/customers")
      private Customer UpdateCustomer(@RequestBody Customer customer){

          customerservice.save(customer);

          return customer;
      }
}
