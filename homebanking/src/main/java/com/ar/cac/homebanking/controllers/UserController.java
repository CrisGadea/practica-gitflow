package com.ar.cac.homebanking.controllers;

import com.ar.cac.homebanking.models.dtos.UserDTO;
import com.ar.cac.homebanking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    // Generar una instancia del Service (UserService) -> Inyectar una instancia mediante Spring Boot
    @Autowired
    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    // Para cada método HTTP permitido debemos realizar una acción
    // Definir el DTO y el Service (Inyección de Dependencia)

    // CRUD: Crear, Leer, Modificar, Eliminar


    // TODO: Refactorizar el método para que retorne un ResponseEntity<List<UserDTO>>
    @GetMapping(value = "/users")
    public List<String> getUsers(){
        List<String> lista = service.getUsers();
        return lista;
        // llamar al servicio de usuarios para obtener la lista desde la base de datos
        //return List.of("Cristian", "Martina", "Lucas");
    }

    @GetMapping(value = "/users/{id}")
    public void getUserById(@PathVariable Long id){

    }

    @PostMapping(value = "/users")
    public void createUser(@RequestBody UserDTO user){

    }

    public void updateAllUser(){

    }

    public void updateUser(){

    }

    public void deleteUser(){

    }

    // Metodo para validar caracteres del email


}
