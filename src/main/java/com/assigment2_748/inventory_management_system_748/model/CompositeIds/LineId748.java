package com.assigment2_748.inventory_management_system_748.model.CompositeIds;

import com.assigment2_748.inventory_management_system_748.model.Part748;
import com.assigment2_748.inventory_management_system_748.model.PurchaseOrder748;

import java.io.Serializable;

import jakarta.persistence.*;

@Embeddable
public class LineId748 implements Serializable {
    @ManyToOne
    @JoinColumn(name = "part_no_748")
    private Part748 part748;

    @ManyToOne
    @JoinColumn(name = "po_no_748")
    private PurchaseOrder748 purchaseOrder748;

    public LineId748() {
    }

    public LineId748(Part748 part748, PurchaseOrder748 purchaseOrder748) {
        this.part748 = part748;
        this.purchaseOrder748 = purchaseOrder748;
    }

    public void setPart748(Part748 part748) {
        this.part748 = part748;
    }

    public Part748 getPart748() {
        return part748;
    }

    public PurchaseOrder748 getPurchaseOrder748() {
        return purchaseOrder748;
    }

    public void setPurchaseOrder748(PurchaseOrder748 purchaseOrder748) {
        this.purchaseOrder748 = purchaseOrder748;
    }
}