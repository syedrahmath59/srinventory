package com.inventory.store.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class Product {

    private Integer id;
    private String productName;
    private String description;
    private String productType;//implement based on enum
    private Date createdDate;
    private Date updatedDate;

}
