package com.employee.employee_entry.dao;

import com.employee.employee_entry.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    private EntityManager entityManager;

    public EmployeeDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public Employee saveEmployee(Employee employee){
        Employee newEmployee = entityManager.merge(employee);
        return newEmployee;
    }
}
