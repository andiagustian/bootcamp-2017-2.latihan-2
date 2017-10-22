/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.pln.repository;

import com.tabeldata.pln.model.Token;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author USER
 */
public interface TokenRepository extends PagingAndSortingRepository<Token, Integer>{
    
}
