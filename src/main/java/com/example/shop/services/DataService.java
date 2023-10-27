package com.example.shop.services;

import com.example.shop.entities.Data;
import com.example.shop.repositories.DataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DataService {
    private final DataRepository dataRepository;

    public void saveToDatabase(List<Data> dataList){
        dataRepository.saveAll(dataList);
    }

}
