package com.assigment2_748.inventory_management_system_748.service;

import com.assigment2_748.inventory_management_system_748.model.Part748;
import com.assigment2_748.inventory_management_system_748.repository.PartRepository748;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartService748 {
    private final PartRepository748 partRepository748;

    @Autowired
    public PartService748(PartRepository748 partRepository748) {
        this.partRepository748 = partRepository748;
    }

    public Optional<List<Part748>> getAllParts748() {
        return Optional.of(partRepository748.findAll());
    }

    public Optional<Part748> getPartById748(Integer part_no_748) {
        return partRepository748.findById(part_no_748);
    }
}
