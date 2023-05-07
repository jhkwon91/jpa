package com.springboot.jpa.data.dao.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangedProductNameDto {
    private Long number;
    private String name;

    public ChangedProductNameDto() {
    }

    public ChangedProductNameDto(Long number, String name) {
        this.number = number;
        this.name = name;
    }
}
