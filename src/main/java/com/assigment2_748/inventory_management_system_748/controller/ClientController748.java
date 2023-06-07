package com.assigment2_748.inventory_management_system_748.controller;

import com.assigment2_748.inventory_management_system_748.model.Client748;
import com.assigment2_748.inventory_management_system_748.service.ClientService748;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/client")
public class ClientController748 {
    private final ClientService748 clientService748;

    @Autowired
    public ClientController748(ClientService748 clientService748) {
        this.clientService748 = clientService748;
    }

    @GetMapping("/getClients")
    public ResponseEntity<List<Client748>> getAllClients748() {
        Optional<List<Client748>> clients748 = clientService748.getAllClients();
        // If clients exists in clients748, then return clients or else return InternalServerError
        return clients748.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.internalServerError().build());
    }
}