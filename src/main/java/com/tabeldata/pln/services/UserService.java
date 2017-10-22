/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.pln.services;

import com.tabeldata.pln.model.User;
import com.tabeldata.pln.model.UserPrincipal;
import com.tabeldata.pln.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    
    @Autowired
    private UserRepository userReposiory;
    
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException{
        User user= userReposiory.findByUsername(s);
        if (user!=null)
            return new UserPrincipal(user);
        else return new UserPrincipal(new User());
    }
}
