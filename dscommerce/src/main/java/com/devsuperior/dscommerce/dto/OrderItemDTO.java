package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDTO {
    private long productId;
    private String name;
    private double price;
    private int quantity;
    private String imgUrl;

    public OrderItemDTO() {}
    public OrderItemDTO(long product_id, String name, double price, int quantity, String imgUrl) {
        this.productId = product_id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imgUrl = imgUrl;
    }
    public OrderItemDTO(OrderItem entity) {
        productId = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
        imgUrl = entity.getProduct().getImgUrl();
    }

    public long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public Double getSubtotal() {
        return price * quantity;
    }
    public String getImgUrl() {
        return imgUrl;
    }
}
