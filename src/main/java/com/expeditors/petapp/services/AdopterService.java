package com.expeditors.petapp.services;

import com.expeditors.petapp.models.Adopter;
import com.expeditors.petapp.repositories.AdopterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdopterService {

    @Autowired
    AdopterRepository adopterRepository;

    public List<Adopter> getByNameAndId(String name, int id){
        return this.adopterRepository.findByNameContainingAndId(name, id);
    }

    public Adopter add(Adopter adopter){
        return this.adopterRepository.save(adopter);
    }

    public void update(Adopter adopter){
        this.adopterRepository.findById(adopter.getId()) // returns Optional<User>
                .ifPresent(adopterToUpdate -> {
                    adopterToUpdate.setName(adopter.getName());
                    adopterToUpdate.setPhoneNumber(adopter.getPhoneNumber());
                    this.adopterRepository.save(adopterToUpdate);
                });
    }

    public void delete(int id){
        this.adopterRepository.deleteById(id);
    }

    public List<Object> getBasicInformationById(int id){
        return this.adopterRepository.getBasicInfoByAdopterId(id);
    }
}
