package com.example.CrudOperations.serviceImpl;

import com.example.CrudOperations.entity.Customer;
import com.example.CrudOperations.repository.CustomerDao;
import com.example.CrudOperations.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerImpl implements CustomerService {
    @Autowired
    private CustomerDao customerdao;
    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customer=customerdao.findAll();
        return customer;
    }

    @Override
    public Customer getById(int id) {
        Optional<Customer> customer=customerdao.findById(id);
        return customer.get();
    }

    @Override
    public void save(Customer customer) {

        customerdao.save(customer);

    }

    @Override
    public void delete(int id) {

        customerdao.deleteById(id);

    }

    @Override
    public void update(Customer customer, int id) {

        customerdao.save(customer);

    }
}
