package com.test.orm.dao.impl;

import com.test.orm.dao.AbstractHibernateDAO;
import com.test.orm.dao.IEmployeeDao;
import com.test.orm.models.Employee;
import org.springframework.stereotype.Repository;

@Repository("IEmployeeDao")
public class EmployeeDAO extends AbstractHibernateDAO<Employee> implements IEmployeeDao {
    public EmployeeDAO() {
        super();
        setClazz(Employee.class);
    }
}
