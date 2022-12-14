package com.alexeev.kivmusic.controllers;

import com.alexeev.kivmusic.models.LocationWarehouseEntity;
import com.alexeev.kivmusic.service.LocationWarehouseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locationwarehouse")
public class LocationWarehouseController {
    private final LocationWarehouseService locationWarehouseService;

    public LocationWarehouseController(LocationWarehouseService locationWarehouseService) {
        this.locationWarehouseService = locationWarehouseService;
    }

    @GetMapping
    public List<LocationWarehouseEntity> findAllLocationWarehouse(){
        return locationWarehouseService.findAllLocationWarehouse();
    }

    @GetMapping("/{id}")
    public Optional<LocationWarehouseEntity> findLocationWarehouseById(@PathVariable("id") Long id){
        return locationWarehouseService.findById(id);
    }

    @PostMapping
    public LocationWarehouseEntity saveLocationWarehouse(@RequestBody LocationWarehouseEntity locationWarehouse){
        return locationWarehouseService.saveLocationWarehouse(locationWarehouse);
    }

    @PutMapping
    public LocationWarehouseEntity updateLocationWarehouse(@RequestBody LocationWarehouseEntity locationWarehouse){
        return locationWarehouseService.updateLocationWarehouse(locationWarehouse);
    }

    @DeleteMapping("/{id}")
    public void deleteBank(@PathVariable("id") Long id){
        locationWarehouseService.deleteLocationWarehouse(id);
    }
}
