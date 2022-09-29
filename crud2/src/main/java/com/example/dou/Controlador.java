package com.example.dou;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/usuario")

public class Controlador {
	
@Autowired
 Servicio servicio;
 
 @GetMapping()
 public List<PetDTO>obtener(){
	 return this.servicio.listar();
 }
	
 @PostMapping
 public ResponseEntity<PetDTO>createpet(@RequestBody PetDTO pdto){
	 return new ResponseEntity(servicio.create(pdto),HttpStatus.CREATED);
 }
 @GetMapping("/{id}")
 @ResponseStatus(HttpStatus.OK)
 public PetDTO obtenerporid(@PathVariable Long id){
	 return  servicio.obtenerId(id);
 }
 @PutMapping("/{id}")
 public ResponseEntity<PetDTO>update(@RequestBody PetDTO pdto,@PathVariable Long id ){
	 return new ResponseEntity(servicio.actualizar(pdto,id),HttpStatus.OK);
 }
 @DeleteMapping("/{id}")
 public String delete(@PathVariable Long id) {
	 return servicio.delete(id);
 }
}
