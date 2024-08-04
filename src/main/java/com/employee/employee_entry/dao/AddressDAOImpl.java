package com.employee.employee_entry.dao;

import com.employee.employee_entry.entity.Address;
import jakarta.persistence.EntityManager;
import org.springframework.transaction.annotation.Transactional;

public class AddressDAOImpl implements AddressDAO{
    private EntityManager entityManager;
    public AddressDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Address newAddress(Address address){
        Address newAddress = entityManager.merge(address);
        return newAddress;
    }
}
