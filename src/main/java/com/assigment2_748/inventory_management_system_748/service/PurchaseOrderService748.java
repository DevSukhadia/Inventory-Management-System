package com.assigment2_748.inventory_management_system_748.service;

import com.assigment2_748.inventory_management_system_748.model.Client748;
import com.assigment2_748.inventory_management_system_748.model.Line748;
import com.assigment2_748.inventory_management_system_748.model.Part748;
import com.assigment2_748.inventory_management_system_748.model.PurchaseOrder748;
import com.assigment2_748.inventory_management_system_748.repository.PurchaseOrderRepository748;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PurchaseOrderService748 {
    private final PurchaseOrderRepository748 purchaseOrderRepository748;
    private final ClientService748 clientService748;
    private final LineService748 lineService748;

    @Autowired
    public PurchaseOrderService748(PurchaseOrderRepository748 purchaseOrderRepository748,
                                   ClientService748 clientService748, LineService748 lineService748) {
        this.purchaseOrderRepository748 = purchaseOrderRepository748;
        this.clientService748 = clientService748;
        this.lineService748 = lineService748;
    }

    public Optional<List<PurchaseOrder748>> getAllPurchaseOrders() {
        return Optional.of(purchaseOrderRepository748.findAll());
    }

    public Optional<List<Line748>> createPurchaseOrder(Integer poNo, Integer clientId, String status,
                                                       List<Part748> parts748, List<Integer> partQuantities748) {
        Optional<Client748> client748 = clientService748.findClientById(clientId);

        if (client748.isEmpty()) {
            return Optional.empty();
        }

        PurchaseOrder748 purchaseOrder748 = new PurchaseOrder748();
        purchaseOrder748.setPo_no_748(poNo);
        purchaseOrder748.setStatus_748(status);
        purchaseOrder748.setDate_of_po_748(LocalDateTime.now());
        purchaseOrder748.setClient748(client748.get());
        
        PurchaseOrder748 savedPurchaseOrder748 = purchaseOrderRepository748.save(purchaseOrder748);

        return Optional.of(lineService748.insertLines(parts748, partQuantities748, savedPurchaseOrder748));
    }
}
