package com.assigment2_748.inventory_management_system_748.model;

import com.assigment2_748.inventory_management_system_748.model.CompositeIds.LineId748;

import jakarta.persistence.*;

@Entity
@Table(name = "line_748")
public class Line748 {

    @EmbeddedId
    private LineId748 lineId748;

    private Integer price_ordered_748;

    private Integer qty_748;

    public Line748() {
    }

    public Line748(LineId748 lineId748, Integer priceOrdered, Integer quantity) {
        this.lineId748 = lineId748;
        this.price_ordered_748 = priceOrdered;
        this.qty_748 = quantity;
    }

    public LineId748 getLineId748() {
        return lineId748;
    }

    public void setLineId748(LineId748 id) {
        this.lineId748 = id;
    }

    public Integer getPriceOrdered() {
        return price_ordered_748;
    }

    public void setPriceOrdered(Integer priceOrdered) {
        this.price_ordered_748 = priceOrdered;
    }

    public Integer getQuantity() {
        return qty_748;
    }

    public void setQuantity(Integer quantity) {
        this.qty_748 = quantity;
    }
}