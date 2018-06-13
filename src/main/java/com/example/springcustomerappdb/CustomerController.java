package com.example.springcustomerappdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public Result add(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return new Result( customer.getName(), "OK");
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public Iterable<Customer> getAll() {
        return customerRepository.findAll();
    }
}
