package com.employee.employee_entry.dao;

import com.employee.employee_entry.entity.Department;

import java.util.List;

public interface DepartmentDAO {
    public Department saveDepratment(Department department);

    public List<Department> findAllDepartment();

    public Department departmentFindById(int departmentId);


}
