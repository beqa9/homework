package com.example.shop.services;

import com.example.shop.entities.Data;
import com.example.shop.repositories.DataRepository;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class ExelService {
    @Autowired
    private DataRepository dataRepository;

    public void processExcelFile(InputStream excelFile) {
        try (Workbook workbook = new XSSFWorkbook(excelFile)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                Double latitude = row.getCell(0).getNumericCellValue();
                Double longitude = row.getCell(1).getNumericCellValue();
                String name = row.getCell(2).getStringCellValue();

                Data data= new Data();
                data.setLatitude(latitude);
                data.setLongitude(longitude);
                data.setName(name);

                dataRepository.save(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


