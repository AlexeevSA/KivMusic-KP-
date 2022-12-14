package com.alexeev.kivmusic.models;

import javax.persistence.*;

@Entity
@Table(name = "Warehouse")
public class WarehouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_warehouse", nullable = false)
    private Long id;

    @Column(name = "warehouse_cell", nullable = false, length = 5)
    private String warehousecell;

    @Column(name = "product_availability", nullable = false)
    private Boolean productavailability = false;

    public WarehouseEntity() {
    }

    public WarehouseEntity(Long id, String warehousecell, Boolean productavailability) {
        this.id = id;
        this.warehousecell = warehousecell;
        this.productavailability = productavailability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWarehousecell() {
        return warehousecell;
    }

    public void setWarehousecell(String warehousecell) {
        this.warehousecell = warehousecell;
    }

    public Boolean getProductavailability() {
        return productavailability;
    }

    public void setProductavailability(Boolean productavailability) {
        this.productavailability = productavailability;
    }
}
