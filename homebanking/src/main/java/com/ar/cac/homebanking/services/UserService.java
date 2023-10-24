package com.ar.cac.homebanking.services;

import com.ar.cac.homebanking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    // Inyectar una instancia del Repositorio
    //@Autowired
    //private final UserRepository repository;

    //public UserService(UserRepository repository){
      //  this.repository = repository;
    //}

    // Metodos

    public List<String> getUsers(){
        List<String> nombres = List.of("Cristian", "Luis", "Alejandra");
        return nombres;
    }


}
