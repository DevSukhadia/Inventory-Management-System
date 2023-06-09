package com.assigment2_748.inventory_management_system_748.controller;

import com.assigment2_748.inventory_management_system_748.model.Part748;
import com.assigment2_748.inventory_management_system_748.service.PartService748;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/part")
public class PartController748 {
    private final PartService748 partService748;

    @Autowired
    public PartController748(PartService748 partService748) {
        this.partService748 = partService748;
    }

    @GetMapping("/getParts")
    public List<Part748> getAllParts748() {
        return partService748.getAllParts748().orElseGet(ArrayList::new);
    }

    @GetMapping("/getPart")
    public Part748 getAllParts748(@RequestParam Integer partNo748) {
        return partService748.getPartById748(partNo748).orElse(null);
    }
}
