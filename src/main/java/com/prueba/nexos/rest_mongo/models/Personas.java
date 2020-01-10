/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.nexos.rest_mongo.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Manuel
 */
public class Personas {

    @Id
    public ObjectId _id;

    public String nombre;
    public String documento;
    public String edad;
    public String parentesco;

    // Constructors
    public Personas() {
    }

    public Personas(ObjectId _id, String nombre, String documento, String edad, String parentesco) {
        this._id = _id;
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.parentesco = parentesco;
    }

    // ObjectId needs to be converted to string
    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

}
