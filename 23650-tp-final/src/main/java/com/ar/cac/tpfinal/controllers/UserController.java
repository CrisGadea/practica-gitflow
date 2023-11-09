package com.ar.cac.tpfinal.controllers;

import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;
import com.ar.cac.tpfinal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    // POR CADA ACCIÓN/METODO HTTP QUE USTEDES QUIERAN IMPLEMENTAR/PERMITIR
    // VAN A TENER UN METODO EN SU CONTROLADOR

    // METODOS HTTP PERMITIDOS:
    // POST, GET (2), PUT, PATCH, DELETE

    // Estructura de datos para REST: ResponseEntity<>

    // Necesito obtener una instancia del servicio de usuarios
    @Autowired
    private UserService service;


    // Obtener una lista de usuarios registrados

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getUsers());
    }

    // Obtener la info de un solo usuario


    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getUserById(id));
    }

    // Crear/Registrar un usuario

    @PostMapping(value = "/users")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createUser(user));
    }

    // Modificar TOTALMENTE un usuario (PUT)
    public String updateFullUser(){
        return "";
    }


    // Modificar PARCIALMENTE un usuario (PATCH)

    public String updateParcialUser(){
        return "";
    }

    // Eliminar un usuario

    public void deleteUser(){

    }

}
