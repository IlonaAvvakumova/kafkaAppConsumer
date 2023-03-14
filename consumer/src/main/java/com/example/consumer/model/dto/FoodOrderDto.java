package com.example.consumer.model.dto;
import lombok.*;

@Data
@Value
public class FoodOrderDto {
    String item;
    Double amount;
}
