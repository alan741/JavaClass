package com.expeditors.petapp.controllers;

import com.expeditors.petapp.exceptionHandlers.exceptions.WrongRequestException;
import com.expeditors.petapp.models.Pet;
import com.expeditors.petapp.types.BreedType;
import com.expeditors.petapp.types.PetType;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PetControllerTest {

    /*@Test
    void addWrongPetTest(){
        Pet petParam = Pet.builder().name("roñita").petTypeId(PetType.BIRD).breedType(BreedType.MIXED).build();

        Mockito.when(petRepository.save(petParam)).thenThrow(new WrongRequestException("We don't accept birds.", HttpStatus.BAD_REQUEST, petParam));

        Pet petResult = this.petService.add(petParam);
        System.out.println(petResult);
        assertNotNull(petResult);
    }*/
}
