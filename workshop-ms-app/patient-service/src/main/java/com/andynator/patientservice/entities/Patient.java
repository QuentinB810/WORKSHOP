package com.andynator.patientservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Patient {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String eamail;
    private boolean malade;
}