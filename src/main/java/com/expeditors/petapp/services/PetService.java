package com.expeditors.petapp.services;

import com.expeditors.petapp.exceptionHandlers.exceptionModels.GenericExceptionModel;
import com.expeditors.petapp.exceptionHandlers.exceptions.WrongRequestException;
import com.expeditors.petapp.models.Adopter;
import com.expeditors.petapp.models.Pet;
import com.expeditors.petapp.repositories.AdopterRepository;
import com.expeditors.petapp.repositories.PetRepository;
import com.expeditors.petapp.types.PetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    PetRepository petRepository;

    public List<Pet> getByName(String name){
        return this.petRepository.findByNameContaining(name);
    }

    public Pet add(Pet pet){
        if(pet.getPetTypeId() == PetType.BIRD){
            throw new WrongRequestException("We don't accept birds.", HttpStatus.BAD_REQUEST, pet);
        }

        return this.petRepository.save(pet);
    }

    public void update(Pet pet){
        this.petRepository.findById(pet.getId()) // returns Optional<User>
                .ifPresent(petToUpdate -> {
                    petToUpdate.setName(pet.getName());
                    petToUpdate.setPetTypeId(pet.getPetTypeId());
                    petToUpdate.setBreedType(pet.getBreedType());
                    petToUpdate.setAdoptionDate(pet.getAdoptionDate());
                    this.petRepository.save(petToUpdate);
                });
    }

    public void delete(int id){
        this.petRepository.deleteById(id);
    }
}
