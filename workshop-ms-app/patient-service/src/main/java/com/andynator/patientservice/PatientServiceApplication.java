package com.andynator.patientservice;

import com.andynator.patientservice.entities.Patient;
import com.andynator.patientservice.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PatientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return  args -> {
            List<Patient> patientList = List.of(
                    Patient.builder()
                            .firstName("Quenten")
                            .lastName("xxxx")
                            .eamail("quenten@gmail.com")
                            .malade(false)
                            .build(),
                    Patient.builder()
                            .firstName("Kevin")
                            .lastName("xxxx")
                            .eamail("kevin@gmail.com")
                            .malade(false)
                            .build(),
                    Patient.builder()
                            .firstName("Dorian")
                            .lastName("xxxx")
                            .eamail("dorian@gmail.com")
                            .malade(false)
                            .build(),
                    Patient.builder()
                            .firstName("Paul Henri")
                            .lastName("xxxx")
                            .eamail("paulhenri@gmail.com")
                            .malade(false)
                            .build(),
                    Patient.builder()
                            .firstName("Andy")
                            .lastName("xxxx")
                            .eamail("andy@gmail.com")
                            .malade(false)
                            .build()
                    );
            patientRepository.saveAll(patientList);
        };
    }

}
