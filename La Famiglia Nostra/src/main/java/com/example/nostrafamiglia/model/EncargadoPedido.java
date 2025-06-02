package com.example.nostrafamiglia.model;

import com.example.nostrafamiglia.enums.Encargado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "encargados_pedidos")
public class EncargadoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resp_encargo")
    private Integer idEncargado;

    @ManyToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

    @Enumerated(EnumType.STRING) // esto es para vincular el enum de encargado_pedido
    @Column(name = "tipo_encargado", nullable = false)
    private Encargado tipoEncargado;

    @Column(name = "id_encargado", nullable = false)
    private Integer idReferencia;

}

