package com.test.orm;

import com.test.orm.dao.AbstractHibernateDAO;

//@Repository
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class GenericHibernateDao<T> extends AbstractHibernateDAO<T> {
}
