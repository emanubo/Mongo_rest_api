/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.nexos.rest_mongo.repositories;

import com.prueba.nexos.rest_mongo.models.Personas;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Manuel
 */
public interface PersonasRepository extends MongoRepository<Personas, String> {
  Personas findBy_id(ObjectId _id);
}