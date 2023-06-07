package com.assigment2_748.inventory_management_system_748.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "po_748")
public class PurchaseOrder748 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer po_no_748;

    private LocalDateTime date_of_po_748;

    private String status_748;

    @ManyToOne
    @JoinColumn(name = "client_comp_id_748", referencedColumnName = "client_id_748")
    private Client748 client748;

    public PurchaseOrder748() {
    }

    public PurchaseOrder748(Integer po_no_748, LocalDateTime date_of_po_748, String status_748, Client748 client748) {
        this.po_no_748 = po_no_748;
        this.date_of_po_748 = date_of_po_748;
        this.status_748 = status_748;
        this.client748 = client748;
    }

    public Integer getPo_no_748() {
        return po_no_748;
    }

    public void setPo_no_748(Integer po_no_748) {
        this.po_no_748 = po_no_748;
    }

    public LocalDateTime getDate_of_po_748() {
        return date_of_po_748;
    }

    public void setDate_of_po_748(LocalDateTime date_of_po_748) {
        this.date_of_po_748 = date_of_po_748;
    }

    public String getStatus_748() {
        return status_748;
    }

    public void setStatus_748(String status_748) {
        this.status_748 = status_748;
    }

    public Client748 getClient748() {
        return client748;
    }

    public void setClient748(Client748 client748) {
        this.client748 = client748;
    }
}