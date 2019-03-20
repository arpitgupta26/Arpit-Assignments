package com.ttn.springboot.Service;

import com.ttn.springboot.Entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataBaseService {
    
    @Autowired
    Database database;
    
    public Database getDataBase(){
        return database;
    }
}
