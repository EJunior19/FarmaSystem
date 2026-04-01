package com.farmasystem.producto.entity;

import com.farmasystem.categoria.entity.Categoria;
import com.farmasystem.marca.entity.Marca;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private String codigo;

    private String principioActivo;

    private String concentracion;

    private String formaFarmaceutica;

    private Boolean requiereReceta;

    private Boolean tieneVencimiento;

    private BigDecimal precioVenta;

    private BigDecimal impuesto;

    private Boolean estado;

    // RELACIONES

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;
}