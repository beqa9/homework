package com.example.shop.controllers;

import com.example.shop.entities.Data;
import com.example.shop.entities.DataHistory;
import com.example.shop.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController {
    private final DataService dataService;

    @Autowired
    public CarController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping("/coordinates")
    public ResponseEntity<String> saveCarCoordinates(
            @RequestParam("carNumber") String carNumber,
            @RequestParam("latitude") Double latitude,
            @RequestParam("longitude") Double longitude) {
        try {
            Data data = new Data();
            data.setLatitude(latitude);
            data.setLongitude(longitude);
            data.setName(carNumber);

            DataHistory dataHistory = new DataHistory();
            dataHistory.setLatitude(latitude);
            dataHistory.setLongtitude(longitude);
            dataHistory.setName(carNumber);

            dataService.saveToDatabase(data);
            dataService.saveToHistoryDatabase(dataHistory);

            return ResponseEntity.ok("Coordinates for car " + carNumber + " saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred while saving car coordinates.");
        }
    }
}
