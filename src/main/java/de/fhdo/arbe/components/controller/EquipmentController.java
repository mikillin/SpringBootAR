package de.fhdo.arbe.components.controller;

import de.fhdo.arbe.components.bean.Equipment;
import de.fhdo.arbe.components.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@Controller
@RequestMapping("/api/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentRepository equipmentRepository;

    // Get all Equipments
    @GetMapping
    public List<Equipment> getAllEquipments() {
        return equipmentRepository.findAll();
    }

    @GetMapping("/move")

    public String getMove(Model model) {

        model.addAttribute("equipments", equipmentRepository.findAll());
        model.addAttribute("name", "Total Name");
        return "index_t";
    }

    // Get an Equipment by ID
    @GetMapping("/{id}")
    public ResponseEntity<Equipment> getEquipmentById(@PathVariable Long id) {
        Optional<Equipment> Equipment = equipmentRepository.findById(id);

        return Equipment.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    // Get an Equipment by code
    @GetMapping("/code/{code}")
    public ResponseEntity<Equipment> getEquipmentByName(@PathVariable String code) {
        Optional<Equipment> Equipment = equipmentRepository.findByCode(code);

        return Equipment.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create a new Equipment
    @PostMapping
    public Equipment createEquipment(@RequestBody Equipment Equipment) {
        return equipmentRepository.save(Equipment);
    }

    // Update an Equipment
    @PutMapping("/{id}")
    public ResponseEntity<Equipment> updateEquipment(@PathVariable Long id, @RequestBody Equipment EquipmentDetails) {
        Optional<Equipment> optionalEquipment = equipmentRepository.findById(id);
        if (optionalEquipment.isPresent()) {
            Equipment Equipment = optionalEquipment.get();
            Equipment.setTitle(EquipmentDetails.getTitle());
            Equipment.setCode(EquipmentDetails.getCode());
            return ResponseEntity.ok(equipmentRepository.save(Equipment));
        }
        return ResponseEntity.notFound().build();
    }

    // Delete an Equipment
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEquipment(@PathVariable Long id) {
        if (equipmentRepository.existsById(id)) {
            equipmentRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}