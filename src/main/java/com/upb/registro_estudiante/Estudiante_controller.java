package com.upb.registroestudiantes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController 
{

    private final Map<String, Estudiante> estudiantes = new HashMap<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante registrar(@RequestBody Estudiante estudiante) 
    {

        if (estudiantes.containsKey(estudiante.getId())) 
            {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Ya existe un estudiante con ese ID"
            );
        }

        estudiantes.put(estudiante.getId(), estudiante);
        return estudiante;
    }

    @GetMapping
    public Collection<Estudiante> listar() {
        return estudiantes.values();
    }
}
    


