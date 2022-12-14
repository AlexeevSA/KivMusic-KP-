package com.alexeev.kivmusic.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Product_Check")
public class ProductCheckEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product_check", nullable = false)
    private Long id;

    @Column(name = "check_number", nullable = false, length = 20)
    private String checknumber;

    @Column(name = "shift_number", nullable = false, length = 20)
    private String shiftnumber;

    @Column(name = "purchase_date", nullable = false)
    private Date purchasedate;

    @Column(name = "total_sum", nullable = false, precision = 38, scale = 2)
    private BigDecimal totalsum;

    @Column(name = "input_sum", nullable = false, precision = 38, scale = 2)
    private BigDecimal inputsum;

    @Column(name = "shop_id", nullable = false)
    private Long shopid;

    @Column(name = "profile_card_id", nullable = false)
    private Long profilecardid;

    @Column(name = "profile_id", nullable = false)
    private Long profileid;


    public ProductCheckEntity() {
    }

    public ProductCheckEntity(Long id, String checknumber, String shiftnumber, Date purchasedate, BigDecimal totalsum, BigDecimal inputsum, Long shopid, Long profilecardid, Long profileid) {
        this.id = id;
        this.checknumber = checknumber;
        this.shiftnumber = shiftnumber;
        this.purchasedate = purchasedate;
        this.totalsum = totalsum;
        this.inputsum = inputsum;
        this.shopid = shopid;
        this.profilecardid = profilecardid;
        this.profileid = profileid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }

    public String getShiftnumber() {
        return shiftnumber;
    }

    public void setShiftnumber(String shiftnumber) {
        this.shiftnumber = shiftnumber;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public BigDecimal getTotalsum() {
        return totalsum;
    }

    public void setTotalsum(BigDecimal totalsum) {
        this.totalsum = totalsum;
    }

    public BigDecimal getInputsum() {
        return inputsum;
    }

    public void setInputsum(BigDecimal inputsum) {
        this.inputsum = inputsum;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Long getProfilecardid() {
        return profilecardid;
    }

    public void setProfilecardid(Long profilecardid) {
        this.profilecardid = profilecardid;
    }

    public Long getProfileid() {
        return profileid;
    }

    public void setProfileid(Long profileid) {
        this.profileid = profileid;
    }
}
