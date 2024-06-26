package com.example.CrudOperations.service;

import com.example.CrudOperations.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomers();

    public Customer getById(int id);

    public void save(Customer customer);

    public void delete(int id);

    public void update(Customer customer,int id );
}
