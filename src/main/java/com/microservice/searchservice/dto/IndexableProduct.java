package com.microservice.searchservice.dto;

import lombok.Data;
import lombok.Builder;
import java.util.Map;
import java.time.Instant;

@Data
@Builder
public class IndexableProduct {
    private String documentId;
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private String category;
    private String author;
    private Integer stock;
    private Instant createdAt;
    private boolean inStock;
    private Map<String, Object> metadata;
}