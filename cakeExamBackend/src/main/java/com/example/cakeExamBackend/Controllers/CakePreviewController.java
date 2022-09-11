package com.example.cakeExamBackend.Controllers;

import com.example.cakeExamBackend.Models.CakeModel;
import com.example.cakeExamBackend.Repositories.CakeRepo;
import com.example.cakeExamBackend.Services.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class CakePreviewController {

    @Autowired
    private CakeRepo cakeRepo;

    @Autowired
    private CakeService cakeService;

    //Működő megoldás.
    @GetMapping("/getCake{id}")
    public Optional<CakeModel> getCake(@RequestParam(name="id") Long id){
        return cakeService.getCakesService(id);
    }
}
