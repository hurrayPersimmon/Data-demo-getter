package com.example.dataget.Controller;

import com.example.dataget.Dto.dataDto;
import com.example.dataget.Entity.dataEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/data")
public class dataController {
    private final com.example.dataget.Service.dataService dataService;

    @RequestMapping("/get")
    public dataEntity getData(@RequestBody dataDto datadto) {
        return dataService.getData(datadto);

    }

}
