package com.employee.employee_entry.service;

import com.employee.employee_entry.dao.EmployeeDAO;
import com.employee.employee_entry.entity.Address;
import com.employee.employee_entry.entity.Department;
import com.employee.employee_entry.entity.Employee;
import com.employee.employee_entry.requestAll.EmployeeRequest;
import com.employee.employee_entry.utils.IdentifierGenerator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private DepartmentService departmentService;
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(DepartmentService departmentService,EmployeeDAO employeeDAO){
        this.departmentService = departmentService;
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public Employee saveEmployee(EmployeeRequest employeeRequest) {
        Employee newEmployee = new Employee();
        Address newAddress = new Address();

//        Employee Object
        newEmployee.setEmployeeId(0);
        newEmployee.setIdentifier(IdentifierGenerator.generateIdentifier());
        newEmployee.setFirstName(employeeRequest.getFirstName());
        newEmployee.setLastName(employeeRequest.getLastName());
        newEmployee.setEmail(employeeRequest.getEmail());
        newEmployee.setBirthDate(employeeRequest.getBirthDate());
        newEmployee.setRole(employeeRequest.getRole());

//        Address Object
        newAddress.setAddressId(0);
        newAddress.setStreetName(employeeRequest.getStreetName());
        newAddress.setHouseNumber(employeeRequest.getHouseNumber());
        newAddress.setZipCode(employeeRequest.getZipCode());

//        Find Department By Id
        Department departmentObj = departmentService.departmentFindById(employeeRequest.getDepartmentId());

        newEmployee.setAddress(newAddress);
        newEmployee.setDepartment(departmentObj);
        Employee returnEmployee = employeeDAO.saveEmployee(newEmployee);

        return returnEmployee;
    }
}
