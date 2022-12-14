package com.alexeev.kivmusic.models;

import javax.persistence.*;

@Entity
@Table(name = "Delivery")
public class DeliveryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_delivery", nullable = false)
    private Long id;

    @Column(name = "warehouse_id", nullable = false)
    private Long warehouseid;


    @Column(name = "profile_id", nullable = false)
    private Long profileid;


    @Column(name = "product_id", nullable = false)
    private Long productid;


    @Column(name = "provider_id", nullable = false)
    private Long providerid;


    public DeliveryEntity() {
    }

    public DeliveryEntity(Long id, Long warehouseid, Long profileid, Long productid, Long providerid) {
        this.id = id;
        this.warehouseid = warehouseid;
        this.profileid = profileid;
        this.productid = productid;
        this.providerid = providerid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Long getProfileid() {
        return profileid;
    }

    public void setProfileid(Long profileid) {
        this.profileid = profileid;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getProviderid() {
        return providerid;
    }

    public void setProviderid(Long providerid) {
        this.providerid = providerid;
    }
}
