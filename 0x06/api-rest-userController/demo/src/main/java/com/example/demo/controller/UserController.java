package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.exception.CPFException;
import com.example.demo.exception.UserIdException;
import com.example.demo.exception.UserNameException;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {

        if (id > 0 && id < 100) {
            return "You have entered valid ID";
        } else {
            throw new UserIdException("ID " + id);
        }
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {

        if (userName.length() > 3 && userName.length() < 15) {
            return "You have entered valid USERNAME";
        } else {
            throw new UserNameException("USERNAME " + userName);
        }
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {

        if (isCPF(cpf)) {
            return "You have entered valid CPF";
        } else {
            throw new CPFException("CPF " + cpf);
        }
    }

    public boolean isCPF(String cpf) {
        return cpf.length() > 3 && cpf.length() < 15;
    }
}
