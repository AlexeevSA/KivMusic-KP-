package com.alexeev.kivmusic.models;

import javax.persistence.*;

@Entity
@Table(name = "Shop")
public class ShopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shop", nullable = false)
    private Long id;

    @Column(name = "shopname", nullable = false, length = 100)
    private String shopname;

    @Column(name = "shopaddress", nullable = false, length = 100)
    private String shopaddress;

    public ShopEntity() {
    }

    public ShopEntity(Long id, String shopname, String shopaddress) {
        this.id = id;
        this.shopname = shopname;
        this.shopaddress = shopaddress;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
