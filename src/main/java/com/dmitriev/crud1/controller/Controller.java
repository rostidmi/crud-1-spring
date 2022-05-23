package com.dmitriev.crud1.controller;

import com.dmitriev.crud1.model.User;
import com.dmitriev.crud1.service.Service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    public final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/users")
        public String findAll (Model model){
        List<User> users = service.findAll();
        model.addAttribute("users", users);
        return "users";
        }

        @GetMapping("/user-create")
    public String userCreateForm (User user){

        return "user-create";
        }
        @PostMapping("/user-create")
        public String userCreate (User user){
        service.userSave(user);
        return "redirect:/users";
        }
        @GetMapping("/user-delete/{id}")
        public String deleteUser (@PathVariable ("id") Long id){
        service.deleteUser(id);
        return "redirect:/users";
        }
        @GetMapping("/user-update/{id}")
        public String userUpdateForm (@PathVariable("id") Long id, Model model){
        User user = service.findUser(id);
        model.addAttribute("user", user);
            return "user-update";
        }
        @PostMapping("/user-update")
        public String userUpdate (User user){
        service.userSave(user);
        return "redirect:/users";
        }
}
