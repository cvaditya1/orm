package com.test.orm.service;

import com.test.orm.dao.IEmployeeDao;
import com.test.orm.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private IEmployeeDao dao;

    public EmployeeService() {
        super();
    }

    public void create(final Employee entity) {
        dao.create(entity);
    }

    public Employee findOne(final long id) {
        return dao.findOne(id);
    }

    public List<Employee> findAll() {
        return dao.findAll();
    }
}
