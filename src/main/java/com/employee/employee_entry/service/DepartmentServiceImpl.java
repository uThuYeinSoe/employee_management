package com.employee.employee_entry.service;

import com.employee.employee_entry.dao.DepartmentDAO;
import com.employee.employee_entry.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDAO departmentDAO;

    @Autowired
    public DepartmentServiceImpl(DepartmentDAO departmentDAO) {
        this.departmentDAO = departmentDAO;
    }

    @Transactional
    public Department saveDepartment(Department department) {
        return departmentDAO.saveDepratment(department);
    }

    @Override
    public List<Department> findAllDepartment() {
        return departmentDAO.findAllDepartment();
    }

    public Department departmentFindById(int departmentId){
        return departmentDAO.departmentFindById(departmentId);
    }

    @Override
    @Transactional
    public Department updateDepartment(Department department) {
        return departmentDAO.saveDepratment(department);
    }


}
