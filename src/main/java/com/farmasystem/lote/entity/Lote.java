package com.farmasystem.lote.entity;

import com.farmasystem.producto.entity.Producto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "lote")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroLote;

    private LocalDate fechaVencimiento;

    private Integer cantidad;

    private BigDecimal costo;

    // RELACION
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
}