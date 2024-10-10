package com.andynator.patientservice.web;

import com.andynator.patientservice.entities.Patient;
import com.andynator.patientservice.repository.PatientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestControler { private PatientRepository patientRepository;

    public PatientRestControler(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    @GetMapping("/patients")
    public List<Patient> patientList() {
        return patientRepository.findAll();
    }
    @GetMapping("/patient/{id}")
    public Patient patientById(@PathVariable Long id) {
        return patientRepository.findById(id).get();
    }
}
