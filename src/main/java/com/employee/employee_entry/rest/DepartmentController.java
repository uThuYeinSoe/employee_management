package com.employee.employee_entry.rest;

import com.employee.employee_entry.entity.Department;
import com.employee.employee_entry.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dept")
public class DepartmentController {
    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> findAllDepartment(){
        return departmentService.findAllDepartment();
    }

    @PutMapping("/departments")
    public Department updateDepartment(@RequestBody Department department){
        return departmentService.updateDepartment(department);
    }
}
