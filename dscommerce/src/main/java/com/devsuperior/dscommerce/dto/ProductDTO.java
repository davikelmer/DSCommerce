package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;


public class ProductDTO {
    private long id;
    @Size(min = 3, max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
    @NotBlank(message = "O campo nome é requerido")
    private String name;
    @NotNull(message = "Campo requirido")
    @Positive(message = "O preço deve ser positivo")
    private double price;
    @Size(min = 10, message = "Descrição precisa ter no mínimo 10 caracteres")
    @NotBlank(message = "O campo descrição é requerido")
    private String description;
    private String imgUrl;

    @NotEmpty(message = "Deve ter pelo menos uma categoria")
    private List<CategoryDTO> categories = new ArrayList<>();

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
        for (Category category : entity.getCategories()) {
            categories.add(new CategoryDTO(category));
        }
    }

    public List<CategoryDTO> getCategories() {
        return categories;
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
