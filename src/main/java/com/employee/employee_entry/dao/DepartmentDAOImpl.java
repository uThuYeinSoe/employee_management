package com.employee.employee_entry.dao;

import com.employee.employee_entry.entity.Department;
import com.employee.employee_entry.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{

    private EntityManager entityManager;

    @Autowired
    public DepartmentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Department saveDepratment(Department department){
        Department saveDepartment = entityManager.merge(department);
        return saveDepartment;
    }

    public List<Department> findAllDepartment(){
        TypedQuery<Department> theQuery = entityManager.createQuery("From Department",Department.class);
        return theQuery.getResultList();
    }

    public Department departmentFindById(int departmentId){
        Department department =entityManager.find(Department.class,departmentId);
        return department;
    }
}
