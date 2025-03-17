package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDTO {
    private long product_id;
    private String name;
    private double price;
    private int quantity;
    public OrderItemDTO() {}
    public OrderItemDTO(long product_id, String name, double price, int quantity) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public OrderItemDTO(OrderItem entity) {
        product_id = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
    }

    public long getProduct_id() {
        return product_id;
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
}
