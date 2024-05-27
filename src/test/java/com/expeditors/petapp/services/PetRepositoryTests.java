package com.expeditors.petapp.services;

import com.expeditors.petapp.exceptionHandlers.exceptions.WrongRequestException;
import com.expeditors.petapp.models.Pet;
import com.expeditors.petapp.repositories.PetRepository;
import com.expeditors.petapp.services.PetService;
import com.expeditors.petapp.types.BreedType;
import com.expeditors.petapp.types.PetType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PetRepositoryTests {

    /*@Mock
    PetRepository petRepository;

    @InjectMocks
    PetService petService;

    @Test
    void getPetsLikeNameTest(){
        String param = "ro";
        List<Pet> petsMockito = List.of(Pet.builder().name("roñita").petTypeId(PetType.DOG).breedType(BreedType.MIXED).build());

        Mockito.when(petRepository.findByNameContaining(param)).thenReturn(petsMockito);

        List<Pet> petsResult = this.petService.getByName(param);
        petsResult.forEach(System.out::println);
        assertNotNull(petsResult);
    }

    @Test
    void addWrongPetTest(){
        Pet petParam = Pet.builder().name("roñita").petTypeId(PetType.BIRD).breedType(BreedType.MIXED).build();

        Mockito.when(petRepository.save(petParam)).thenThrow(new WrongRequestException("We don't accept birds.", HttpStatus.BAD_REQUEST, petParam));

        Pet petResult = this.petService.add(petParam);
        System.out.println(petResult);
        assertNotNull(petResult);
    }*/

}
