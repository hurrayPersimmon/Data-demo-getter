package com.example.dataget.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Entity
@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class dataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dataId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp dataCreatedAt;
    private String node1;
    private String node2;
    private Integer birthYear;
    private Integer gender;
    private Double height;
    private Double weight;
    private Integer walkSpeed;
    private Double temperature;
    private Double precipitationProbability;
    private Double precipitation;
    private Double takeTime;
    private Double weightShortest;
    private Double weightOptimal;
}