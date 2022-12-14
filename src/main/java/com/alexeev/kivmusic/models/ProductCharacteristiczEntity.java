package com.alexeev.kivmusic.models;

import javax.persistence.*;

@Entity
@Table(name = "product_characteristicz")
public class ProductCharacteristiczEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_productcharacteristicz", nullable = false)
    private Long id;

    @Column(name = "product_id", nullable = false)
    private Long productid;

    @Column(name = "characteristicz_id", nullable = false)
    private Long characteristiczid;

    public ProductCharacteristiczEntity() {
    }

    public ProductCharacteristiczEntity(Long id, Long productid, Long characteristiczid) {
        this.id = id;
        this.productid = productid;
        this.characteristiczid = characteristiczid;
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

    public Long getCharacteristiczid() {
        return characteristiczid;
    }

    public void setCharacteristiczid(Long characteristiczid) {
        this.characteristiczid = characteristiczid;
    }
}
