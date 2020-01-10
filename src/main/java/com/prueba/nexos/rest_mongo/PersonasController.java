/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.nexos.rest_mongo;

import com.prueba.nexos.rest_mongo.models.Personas;
import com.prueba.nexos.rest_mongo.repositories.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Manuel
 */
@RestController
@RequestMapping("/personas")
public class PersonasController {

    @Autowired
    private PersonasRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Personas> getAllPersonas() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Personas getPersonaById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyPersonaById(@PathVariable("id") ObjectId id, @Valid @RequestBody Personas personas) {
        personas.set_id(id);
        repository.save(personas);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Personas createPersona(@Valid @RequestBody Personas personas) {
        personas.set_id(ObjectId.get());
        repository.save(personas);
        return personas;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePersona(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}
