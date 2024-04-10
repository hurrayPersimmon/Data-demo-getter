package com.example.dataget.Repository;

import com.example.dataget.Entity.dataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dataRepository extends JpaRepository<dataEntity, Long> {

}
