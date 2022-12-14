package com.alexeev.kivmusic.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product", nullable = false)
    private Long id;

    @Column(name = "productname", nullable = false, length = 30)
    private String productname;

    @Column(name = "productprice", nullable = false, precision = 38, scale = 2)
    private BigDecimal productprice;

    @Column(name = "producttype_id", nullable = false)
    private Long producttypeid;

    public ProductEntity(Long producttypeid) {
        this.producttypeid = producttypeid;
    }

    public ProductEntity() {

    }

    public Long getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Long producttypeid) {
        this.producttypeid = producttypeid;
    }

    public ProductEntity(Long id, String productname, BigDecimal productprice, Long producttypeid) {
        this.id = id;
        this.productname = productname;
        this.productprice = productprice;
        this.producttypeid = producttypeid;
    }

    public BigDecimal getProductprice() {
        return productprice;
    }

    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
