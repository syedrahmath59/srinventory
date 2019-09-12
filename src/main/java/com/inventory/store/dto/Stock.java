package com.inventory.store.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Stock {
    private Integer id;
    private String stockType;
    private Integer availableStock;
    private Product product;
}
