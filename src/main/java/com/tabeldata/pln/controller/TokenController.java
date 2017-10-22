/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.pln.controller;


import com.tabeldata.pln.model.User;
import com.tabeldata.pln.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/token")
public class TokenController {
    
    @Autowired
    private UserRepository userRepository;
    
//   Method menambah token
    @GetMapping("/new")
    public String newToken(Authentication auth){
        User userLogin = userRepository.findByUsername(auth.getName());
        auth.getAuthorities();
        return "/token/TambahToken";
    }
    
}
