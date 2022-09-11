package com.example.cakeExamBackend.Services;

import com.example.cakeExamBackend.Models.CakeModel;
import com.example.cakeExamBackend.Repositories.CakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CakeService {

    @Autowired
    private CakeRepo cakeRepo;

    public Optional<CakeModel> getCakesService(Long id){
        return cakeRepo.findById(id);
    }
}
