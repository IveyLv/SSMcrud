package com.lvey.crud.service;

import com.lvey.crud.dao.EmployeeMapper;
import com.lvey.crud.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询所有员工
     */
    public List<Employee> getAll() {
        return employeeMapper.selectByExampleWithDept(null);
    }

    /**
     * 保存员工信息
     */
    public void saveEmp(Employee employee) {
        employeeMapper.insertSelective(employee);
    }
}
