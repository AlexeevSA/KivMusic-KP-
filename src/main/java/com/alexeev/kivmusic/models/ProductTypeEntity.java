package com.alexeev.kivmusic.models;

import javax.persistence.*;

@Entity
@Table(name = "Product_Type")
public class ProductTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producttype", nullable = false)
    private Long id;

    @Column(name = "typename", nullable = false, length = 100)
    private String typename;

    public ProductTypeEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public ProductTypeEntity(Long id, String typename) {
        this.id = id;
        this.typename = typename;
    }
}
