package com.assigment2_748.inventory_management_system_748.controller;

import com.assigment2_748.inventory_management_system_748.model.Line748;
import com.assigment2_748.inventory_management_system_748.model.Part748;
import com.assigment2_748.inventory_management_system_748.model.PurchaseOrder748;
import com.assigment2_748.inventory_management_system_748.service.LineService748;
import com.assigment2_748.inventory_management_system_748.service.PartService748;
import com.assigment2_748.inventory_management_system_748.service.PurchaseOrderService748;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/purchaseOrder")
public class PurchaseOrderController748 {
    private final PurchaseOrderService748 purchaseOrderService748;
    private final PartService748 partService748;
    private final LineService748 lineService748;
    private final ObjectMapper objectMapper;

    @Autowired
    public PurchaseOrderController748(PurchaseOrderService748 purchaseOrderService748
        , ObjectMapper objectMapper
        , PartService748 partService748
        , LineService748 lineService748) {
        this.purchaseOrderService748 = purchaseOrderService748;
        this.partService748 = partService748;
        this.lineService748 = lineService748;
        this.objectMapper = objectMapper;
    }

    @GetMapping("/getAll")
    public List<PurchaseOrder748> getAllPurchaseOrders() {
        return purchaseOrderService748.getAllPurchaseOrders().orElse(new ArrayList<>());
    }

    @GetMapping("/getPurchaseOrder")
    public List<Line748> getPurchaseOrder(@RequestParam Integer po_no_748) {
        return lineService748.getAllLinesByPoId(po_no_748);
    }

    @PostMapping("/create")
    public ResponseEntity<List<Line748>> createPurchaseOrder748(@RequestBody Map<String, Object> request) {
        System.out.println("In createPurchaseOrder748()");

        // Destruct the request
        Integer clientId748 = objectMapper.convertValue(request.get("clientId"), new TypeReference<>() {});
        List<Map<String, Object>> partQuantityPairs = objectMapper.convertValue(request.get("partQuantityPairs"), new TypeReference<>() {});
        String status = objectMapper.convertValue(request.get("status"), new TypeReference<>() {});

        if (partQuantityPairs.isEmpty() || clientId748 == null || clientId748 <= 0 || status == null || status.isEmpty()) {
            System.out.println("Unexpected state of arguments.");
            ResponseEntity.badRequest().build();
        }

        List<Part748> parts748 = new ArrayList<>();
        List<Integer> partQuantities748 = new ArrayList<>();
        for (Map<String, Object> partQuantityPair : partQuantityPairs) {
            Integer partId748 = objectMapper.convertValue(partQuantityPair.get("part_no_748"), new TypeReference<>() {});
            Part748 part748 = partService748.getPartById748(partId748).orElse(null);
            parts748.add(part748);
            partQuantities748.add(objectMapper.convertValue(partQuantityPair.get("q_748"), new TypeReference<>() {}));
        }

        Optional<List<Line748>> savedLines748;
        savedLines748 = purchaseOrderService748.createPurchaseOrder(clientId748, status, parts748, partQuantities748);

        if (savedLines748.isEmpty()) {
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok(savedLines748.orElse(new ArrayList<>()));
    }
}
