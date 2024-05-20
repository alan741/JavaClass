package com.expeditors.petapp.repositories;

import com.expeditors.petapp.models.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdopterRepository extends JpaRepository<Adopter, Integer> {

    List<Adopter> findByNameContainingAndId(String name, int id);

    @Query("SELECT pet.adopter.name FROM Pet pet WHERE pet.adopter.id = :id")
    List<Object> getBasicInfoByAdopterId(int id);
}
