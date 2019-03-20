package com.ttn.springboot.Controller;

import com.ttn.springboot.Entity.Database;
import com.ttn.springboot.Service.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataBaseController {
    
    @Autowired
    DataBaseService dataBaseService;
    
    @GetMapping("/getdatabase")
    @ResponseBody
    public Database getDatabaseDetails(){
        return dataBaseService.getDataBase();
    }
}
