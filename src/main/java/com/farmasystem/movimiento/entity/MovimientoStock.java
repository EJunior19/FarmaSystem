package com.farmasystem.movimiento.entity;

import com.farmasystem.funcionario.entity.Funcionario;
import com.farmasystem.lote.entity.Lote;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "movimiento_stock")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimientoStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    private Integer cantidad;

    private LocalDateTime fecha;

    @Column(name = "movimiento_stockcol")
    private String descripcion;

    @Column(name = "stock_origen_id")
    private Long stockOrigenId;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "lote_id")
    private Lote lote;
}