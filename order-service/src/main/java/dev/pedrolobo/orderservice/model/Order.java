package dev.pedrolobo.orderservice.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String orderNumber;

  @OneToMany(cascade = CascadeType.ALL)
  private List<OrderLineItens> orderLineItemList;

}
