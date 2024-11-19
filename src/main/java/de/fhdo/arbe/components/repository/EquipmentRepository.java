package de.fhdo.arbe.components.repository;


import de.fhdo.arbe.components.bean.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    Optional<Equipment> findByCode(String Code);

}

