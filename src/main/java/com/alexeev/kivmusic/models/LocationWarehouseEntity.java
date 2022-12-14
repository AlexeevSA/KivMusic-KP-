package com.alexeev.kivmusic.models;

import javax.persistence.*;

@Entity
@Table(name = "location_warehouse")
public class LocationWarehouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locationwarehouse", nullable = false)
    private Long id;

    @Column(name = "product_id", nullable = false)
    private Long productid;

    @Column(name = "warehouse_id", nullable = false)
    private Long warehouseid;

    @Column(name = "quantity_of_goods_on_warehouse", nullable = false)
    private Integer quantityofgoodsonwarehouse;

    @Column(name = "profile_id", nullable = false)
    private Long profileid;

    public LocationWarehouseEntity() {
    }

    public LocationWarehouseEntity(Long id, Long productid, Long warehouseid, Integer quantityofgoodsonwarehouse, Long profileid) {
        this.id = id;
        this.productid = productid;
        this.warehouseid = warehouseid;
        this.quantityofgoodsonwarehouse = quantityofgoodsonwarehouse;
        this.profileid = profileid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getQuantityofgoodsonwarehouse() {
        return quantityofgoodsonwarehouse;
    }

    public void setQuantityofgoodsonwarehouse(Integer quantityofgoodsonwarehouse) {
        this.quantityofgoodsonwarehouse = quantityofgoodsonwarehouse;
    }

    public Long getProfileid() {
        return profileid;
    }

    public void setProfileid(Long profileid) {
        this.profileid = profileid;
    }
}
