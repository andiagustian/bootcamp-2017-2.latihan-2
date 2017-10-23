/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.pln.controller;


import com.tabeldata.pln.model.Token;
import com.tabeldata.pln.model.User;
import com.tabeldata.pln.repository.TokenRepository;
import com.tabeldata.pln.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/token")
public class TokenController {
    
    @Autowired
    private TokenRepository tokenRepository;
    @Autowired
    private UserRepository userRepository;
    
//   Method menambah token
    @GetMapping("/new")
    public String newToken(Authentication auth,@ModelAttribute Token token,Model model){
//        User userLogin = userRepository.findByUsername(auth.getName());
//        auth.getAuthorities();
        model.addAttribute("tkn", token);
        return "/token/tambah-token";
    }
    
    @PostMapping("/new")
    public String submitToken(@ModelAttribute Token token){
        tokenRepository.save(token);
        return "redirect:/token/new";

    }
    
    @GetMapping("/list")
    public String listToken(Model model){
        model.addAttribute("lstToken",tokenRepository.findAll());
        return "/token/list-token";
    }
    
    @GetMapping("/delete")
    public String deleteToken(@RequestParam(name="kode", required=true)Token token){
        tokenRepository.delete(token);
        return "redirect:/token/list";
    }
    
    @GetMapping("/update")
    public String tokenById(@RequestParam(name="kode", required = true)Token token, Model model){
        model.addAttribute("tkn", token);
        return "/token/update-token";
    }
    
}
