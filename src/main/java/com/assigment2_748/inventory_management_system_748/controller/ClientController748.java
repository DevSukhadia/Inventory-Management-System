package com.assigment2_748.inventory_management_system_748.controller;

import com.assigment2_748.inventory_management_system_748.model.Client748;
import com.assigment2_748.inventory_management_system_748.service.ClientService748;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    public List<Client748> getAllClients748() {
        return clientService748.getAllClients().orElseGet(ArrayList::new);
    }
}
