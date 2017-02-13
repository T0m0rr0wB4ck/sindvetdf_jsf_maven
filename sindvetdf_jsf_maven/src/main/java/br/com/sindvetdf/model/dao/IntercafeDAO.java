package br.com.sindvetdf.model.dao;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import java.io.Serializable;

public interface IntercafeDAO<T> {
    void save (T entity);
    void update (T entity);
    void remove (T entity);
    void merge (T entity);
    T getEntity(Serializable id);
    T getEntityByDetachedCriteria(DetachedCriteria criteria);
    List<T> getEntities();
    List<T> getListBydetachedCriteria(DetachedCriteria criteria);    
}
