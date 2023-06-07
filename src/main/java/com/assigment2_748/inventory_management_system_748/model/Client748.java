package com.assigment2_748.inventory_management_system_748.model;

import jakarta.persistence.*;

@Entity
@Table(name = "client_748")
public class Client748 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer client_id_748;

    private String client_name_748;

    private String client_city_748;

    private String client_password_748;

    private Integer money_owed_748;

    public Client748() {
    }

    public Client748(Integer client_id_748, String client_name_748, String client_city_748, String client_password_748, Integer money_owed_748) {
        this.client_id_748 = client_id_748;
        this.client_name_748 = client_name_748;
        this.client_city_748 = client_city_748;
        this.client_password_748 = client_password_748;
        this.money_owed_748 = money_owed_748;
    }

    public Integer getClient_id_748() {
        return client_id_748;
    }

    public void setClient_id_748(Integer client_id_748) {
        this.client_id_748 = client_id_748;
    }

    public String getClient_name_748() {
        return client_name_748;
    }

    public void setClient_name_748(String client_name_748) {
        this.client_name_748 = client_name_748;
    }

    public String getClient_city_748() {
        return client_city_748;
    }

    public void setClient_city_748(String client_city_748) {
        this.client_city_748 = client_city_748;
    }

    public String getClient_password_748() {
        return client_password_748;
    }

    public void setClient_password_748(String client_password_748) {
        this.client_password_748 = client_password_748;
    }

    public Integer getMoney_owed_748() {
        return money_owed_748;
    }

    public void setMoney_owed_748(Integer money_owed_748) {
        this.money_owed_748 = money_owed_748;
    }
}
