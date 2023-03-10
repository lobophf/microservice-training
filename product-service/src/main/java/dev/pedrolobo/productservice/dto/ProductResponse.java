package dev.pedrolobo.productservice.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse{

  @Id
  private Long id;
  private String name;
  private String description;
  private BigDecimal price;
}
