/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.pln.repository;

import com.example.TokenListrikPLN.model.Pelanggan;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author USER
 */
public interface PelangganRepository extends PagingAndSortingRepository<Pelanggan, Integer>{
    
}
