package com.alexeev.kivmusic.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "Product_History")
public class ProductHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product_history", nullable = false)
    private Long id;

    @Column(name = "status_record", nullable = false)
    private String statusrecord;

    @Column(name = "product_info", nullable = false)
    private String productinfo;

    @Column(name = "characteristicz_info", nullable = false)
    private String characteristiczinfo;

    @Column(name = "date_create")
    private Date dateCreate;

    public ProductHistoryEntity() {
    }

    public ProductHistoryEntity(Long id, String statusrecord, String productinfo, String characteristiczinfo, Date dateCreate) {
        this.id = id;
        this.statusrecord = statusrecord;
        this.productinfo = productinfo;
        this.characteristiczinfo = characteristiczinfo;
        this.dateCreate = dateCreate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusrecord() {
        return statusrecord;
    }

    public void setStatusrecord(String statusrecord) {
        this.statusrecord = statusrecord;
    }

    public String getProductinfo() {
        return productinfo;
    }

    public void setProductinfo(String productinfo) {
        this.productinfo = productinfo;
    }

    public String getCharacteristiczinfo() {
        return characteristiczinfo;
    }

    public void setCharacteristiczinfo(String characteristiczinfo) {
        this.characteristiczinfo = characteristiczinfo;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
