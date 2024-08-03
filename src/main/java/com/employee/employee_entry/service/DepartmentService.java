package com.employee.employee_entry.service;

import com.employee.employee_entry.entity.Department;

import java.util.List;


public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> findAllDepartment();
    public Department updateDepartment(Department department);
}
