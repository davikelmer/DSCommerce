package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;


public class ProductDTO {
    private long id;
    private String name;
    private double price;
    private String description;
    private String imgUrl;

    public ProductDTO() {}

    public ProductDTO(long id, String name, double price, String description, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        description = entity.getDescription();
        imgUrl = entity.getImgUrl();
    }
    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
