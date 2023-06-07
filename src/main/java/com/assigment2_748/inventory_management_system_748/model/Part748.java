package com.assigment2_748.inventory_management_system_748.model;

import jakarta.persistence.*;

@Entity
@Table(name = "part_748")
public class Part748 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer part_no_748;

    private String part_name_748;

    private String part_description_748;

    private Long current_price_748;

    private Integer qoh_748;

    public Part748(Integer part_no_748, String part_name_748, String part_description_748, Long current_price_748, Integer qoh_748) {
        this.part_no_748 = part_no_748;
        this.part_name_748 = part_name_748;
        this.part_description_748 = part_description_748;
        this.current_price_748 = current_price_748;
        this.qoh_748 = qoh_748;
    }

    public Part748() {
    }

    public Integer getPart_no_748() {
        return part_no_748;
    }

    public void setPart_no_748(Integer part_no_748) {
        this.part_no_748 = part_no_748;
    }

    public String getPart_name_748() {
        return part_name_748;
    }

    public void setPart_name_748(String part_name_748) {
        this.part_name_748 = part_name_748;
    }

    public String getPart_description_748() {
        return part_description_748;
    }

    public void setPart_description_748(String part_description_748) {
        this.part_description_748 = part_description_748;
    }

    public Long getCurrent_price_748() {
        return current_price_748;
    }

    public void setCurrent_price_748(Long current_price_748) {
        this.current_price_748 = current_price_748;
    }

    public Integer getQoh_748() {
        return qoh_748;
    }

    public void setQoh_748(Integer qoh_748) {
        this.qoh_748 = qoh_748;
    }
}
