package de.fhdo.arbe;

import de.fhdo.arbe.components.bean.Equipment;
import de.fhdo.arbe.components.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final EquipmentRepository equipmentRepository;

    @Autowired
    public DataInitializer(EquipmentRepository repository) {
        this.equipmentRepository = repository;
    }


    @Override
    public void run(String... args) throws Exception {

        equipmentRepository.saveAll(Arrays.asList(
                new Equipment(1L, "Mikrokontroller", "MK-001", "Modul ESP32"),
                new Equipment(2L, "Kuli", "Do-001", "Model Schreiber")
        ));

        System.out.println("Sample data inserted into the test database.");
    }

}
