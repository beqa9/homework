package com.example.shop.controllers;

import com.example.shop.entities.GFG;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;


@RestController
@RequestMapping("/distance")
class DistanceController {

    @GetMapping
    public double calculateDistance() {
        try {
            // Read the Excel file
            FileInputStream file = new FileInputStream("/home/beqa/Documents/exel.xlsx");
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);

            // Get the coordinates from the Excel file
            double lat1 = sheet.getRow(0).getCell(0).getNumericCellValue();
            double lon1 = sheet.getRow(0).getCell(1).getNumericCellValue();
            double lat2 = sheet.getRow(1).getCell(0).getNumericCellValue();
            double lon2 = sheet.getRow(1).getCell(1).getNumericCellValue();

            // Calculate the distance
            double distance = GFG.calculateDistance(lat1, lon1, lat2, lon2);

            // Close the workbook and file
            workbook.close();
            file.close();

            return distance;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}