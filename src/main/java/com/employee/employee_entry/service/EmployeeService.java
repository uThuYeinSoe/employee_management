package com.employee.employee_entry.service;

import com.employee.employee_entry.entity.Employee;
import com.employee.employee_entry.requestAll.EmployeeRequest;

public interface EmployeeService {
    public Employee saveEmployee(EmployeeRequest employeeRequest);
}
