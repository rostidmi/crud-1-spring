package com.dmitriev.crud1.service;

import com.dmitriev.crud1.model.User;
import com.dmitriev.crud1.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<User> findAll (){
        return repository.findAll();
    }

    public User userSave (User user){

        return repository.save(user);
    }
    public void deleteUser (Long id){
        repository.deleteById(id);
    }
    public User findUser (Long id){
        return repository.findById(id).orElse(null);
    }
}
