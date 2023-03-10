package dev.pedrolobo.orderservice.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "tb_order_line_item")
@NoArgsConstructor
@AllArgsConstructor

public class OrderLineItens {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  @Column(name = "sku_code")
  private String skuCode;

  private BigDecimal price;

  private Integer quantity;
}
