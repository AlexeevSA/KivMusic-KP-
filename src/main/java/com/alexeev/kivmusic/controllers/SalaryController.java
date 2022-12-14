package com.alexeev.kivmusic.controllers;

import com.alexeev.kivmusic.models.SalaryEntity;
import com.alexeev.kivmusic.service.SalaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/salary")
public class SalaryController {
    private final SalaryService salaryService;

    public SalaryController(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @GetMapping
    public List<SalaryEntity> findAllSalary(){
        return salaryService.findAllSalary();
    }

    @GetMapping("/{id}")
    public Optional<SalaryEntity> findSalaryById(@PathVariable("id") Long id){
        return salaryService.findById(id);
    }

    @PostMapping
    public SalaryEntity saveSalary(@RequestBody SalaryEntity salary){
        return salaryService.saveSalary(salary);
    }

    @PutMapping
    public SalaryEntity updateSalary(@RequestBody SalaryEntity salary){
        return salaryService.updateSalary(salary);
    }

    @DeleteMapping("/{id}")
    public void deleteSalary(@PathVariable("id") Long id){
        salaryService.deleteSalary(id);
    }
}
