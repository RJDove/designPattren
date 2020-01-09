package com.rj.design.study.test;

/**
 * @author renjin
 * @date 2019/11/25
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer getCustomerByName() {
        Customer customer = new Customer();
        customer.setAddress("sz");
        customer.setAge("24");
        customer.setName("rj");
        return customer;
    }
}
