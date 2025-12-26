package com.coderjd.practice.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Address {
    private City city;
}
