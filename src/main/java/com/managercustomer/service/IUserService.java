package com.managercustomer.service;

import com.managercustomer.model.User;

import java.sql.SQLException;
import java.util.List;

public abstract class IUserService {
    public abstract List<User> findAll();

    public abstract void create(User user) throws SQLException;

    public abstract User findById(int id);

    public abstract void update(User user) throws SQLException;

    public abstract void remove(int id) throws SQLException;

    public abstract List<User> findByCountry(String country) throws SQLException;

    public abstract List<User> sortByName();

}
