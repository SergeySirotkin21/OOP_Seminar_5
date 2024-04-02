package controller;

import data.User;
import service.DataService;

public class Controller {
    
    private DataService dataService = new DataService();

    public void createUser(User user, String type){  
        dataService.createUser(user, type);
    }

    public void read(String type){
        dataService.read(type);
        System.out.println(dataService.read(type));
    }
}

    
