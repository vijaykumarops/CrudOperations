package com.example.CrudOperations.controller;

import com.example.CrudOperations.entity.Customer;
import com.example.CrudOperations.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
      @Autowired
      public CustomerService customerservice;


      private List<Customer> getAllCustomers(){

          return customerservice.getAllCustomers();
      }

      private Customer getCustomer(@PathVariable("id") int id){

          return customerservice.getById(id);
      }
      public Customer saveCustomer(@RequestBody Customer customer){

           customerservice.save(customer);

           return customer;
      }

      private Customer UpdateCustomer(@RequestBody Customer customer){

          customerservice.save(customer);

          return customer;
      }
}
