package com.siemens.vehiclerentingapplication.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();

    T findOne(int id);

    void update(T entity);

    Boolean delete(T entity);

    T save(T entity);
}
