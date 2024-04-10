package com.example.dataget.Repository;

import com.example.dataget.Entity.nodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface nodeRepository extends JpaRepository<nodeEntity, Long> {
    nodeEntity findByNodeName(String nodeName);

}
