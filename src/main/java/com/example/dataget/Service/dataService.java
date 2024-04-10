package com.example.dataget.Service;

import com.example.dataget.Dto.dataDto;
import com.example.dataget.Entity.dataEntity;
import com.example.dataget.Entity.nodeEntity;
import com.example.dataget.Repository.dataRepository;
import com.example.dataget.Repository.nodeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class dataService {
    private final dataRepository dataRepository;
    private final nodeRepository nodeRepository;

    public dataEntity getData(dataDto datadto) {
        dataEntity data = datadto.toEntity();
        nodeEntity nodeOne = nodeRepository.findByNodeName(datadto.getNode1());
        nodeEntity nodeTwo = nodeRepository.findByNodeName(datadto.getNode2());
        data.setWeightOptimal(nodeOne.getNodeAltitude() - nodeTwo.getNodeAltitude());
        return dataRepository.save(data);
    }
}
