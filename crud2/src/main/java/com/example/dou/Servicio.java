package com.example.dou;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service

public class Servicio {

	@Autowired
	Repositorio repo;
	@Autowired
    ModelMapper model;
  public List<PetDTO> listar() {
	  return repo.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
  }
	
  private PetDTO mapToDto(Pet pet) {
	  return model.map(pet, PetDTO.class);
  }
  private Pet mapToEntity(PetDTO pdto) {
	  return model.map(pdto, Pet.class);
  }
  
  public PetDTO create(PetDTO pdto) {
	  Pet pet=mapToEntity(pdto);
	  return mapToDto(repo.save(pet));
  }
  
  public PetDTO obtenerId(Long id) {
	   Pet pet= repo.findById(id).orElseThrow(()->new ResourceException("Pet","Id",id));
	  return mapToDto(pet);
  }
  
  public PetDTO actualizar(PetDTO pdto,Long id) {
	  Pet pet=repo.findById(id).orElseThrow(()->new ResourceException("Pet","Id",id));
	  pet.setName(pdto.getName());
	  pet.setCumpleaños(pdto.getCumpleaños());
	  pet.setRaza(pdto.getRaza());
	  pet.setTienevacunas(pdto.getVacunas());
	  pet.setGender(pdto.getGender());
	  repo.save(pet);
	 return mapToDto(pet);
  }
  public String delete(Long id) {
	  Pet pet=repo.findById(id).orElseThrow(()->new ResourceException("Pet","Id",id));
	  repo.delete(pet);
	  return "La mascota fue eliminada Exitosamente";
  }
}
