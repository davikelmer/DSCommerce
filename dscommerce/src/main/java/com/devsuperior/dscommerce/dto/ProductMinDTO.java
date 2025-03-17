package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


public class ProductMinDTO {
    private long id;
    private String name;
    private double price;
    private String imgUrl;

    public ProductMinDTO() {}

    public ProductMinDTO(long id, String name, double price, String description, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductMinDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }
    public String getImgUrl() {
        return imgUrl;
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
