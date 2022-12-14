package com.alexeev.kivmusic.models;

import javax.persistence.*;

@Entity
@Table(name = "Consumer_Cart")
public class ConsumerCartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consumer_cart", nullable = false)
    private Long id;

    @Column(name = "quantity_of_product", nullable = false)
    private Integer quantityOfProduct;

    @Column(name = "product_id", nullable = false)
    private Long productid;

    @Column(name = "product_check_id", nullable = false)
    private Long productcheckid;

    public ConsumerCartEntity() {
    }

    public ConsumerCartEntity(Long id, Integer quantityOfProduct, Long productid, Long productcheckid) {
        this.id = id;
        this.quantityOfProduct = quantityOfProduct;
        this.productid = productid;
        this.productcheckid = productcheckid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(Integer quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getProductcheckid() {
        return productcheckid;
    }

    public void setProductcheckid(Long productcheckid) {
        this.productcheckid = productcheckid;
    }
}
