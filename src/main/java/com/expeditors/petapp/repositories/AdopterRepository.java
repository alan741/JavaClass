package com.expeditors.petapp.repositories;

import com.expeditors.petapp.models.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdopterRepository extends JpaRepository<Adopter, Integer> {

    List<Adopter> findByNameContainingAndId(String name, int id);

    @Query("SELECT adopt.name, pet.name FROM Adopter adopt LEFT JOIN Pet pet ON adopt.id = pet.adopter.id WHERE adopt.id = :id")
    List<Object> getBasicInfoByAdopterId(int id);
}
