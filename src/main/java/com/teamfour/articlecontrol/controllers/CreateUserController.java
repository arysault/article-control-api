package com.teamfour.articlecontrol.controllers;


import com.teamfour.articlecontrol.models.Participant;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



public class CreateUserController {


    @PostMapping("/")
    public Participant handle(@RequestBody Participant user){
        return user;
    }

}
