package com.assigment2_748.inventory_management_system_748.service;

import com.assigment2_748.inventory_management_system_748.model.Client748;
import com.assigment2_748.inventory_management_system_748.model.Part748;
import com.assigment2_748.inventory_management_system_748.repository.ClientRepository748;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClientService748 {
    private final ClientRepository748 clientRepository748;

    @Autowired
    public ClientService748(ClientRepository748 clientRepository748) {
        this.clientRepository748 = clientRepository748;
    }

    public Optional<Client748> findClientById(Integer client_id_748) {
        return clientRepository748.findById(client_id_748);
    }

    public Optional<List<Client748>> getAllClients() {
        return Optional.of(clientRepository748.findAll());
    }
}
