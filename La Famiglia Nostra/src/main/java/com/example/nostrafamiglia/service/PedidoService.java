package com.example.nostrafamiglia.service;


import com.example.nostrafamiglia.model.Pedido;
import com.example.nostrafamiglia.model.Servicios;
import com.example.nostrafamiglia.model.Usuario;
import com.example.nostrafamiglia.repository.PedidoRepository;
import com.example.nostrafamiglia.repository.ServicioRepository;
import com.example.nostrafamiglia.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ServicioRepository servicioRepository;
    @Autowired
    private UsuariosRepository usuarioRepository;

    // get
    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    // ID
    public Optional<Pedido> getPedidoById(Integer id) {
        return pedidoRepository.findById(id);
    }

    // guardar
    public Pedido savePedido(Pedido pedido) {
        Integer idServicio = pedido.getServicio().getIdServicio();
        Integer idUsuario = pedido.getUsuario().getIdUsuario();

        Servicios servicio = servicioRepository.findById(idServicio)
                .orElseThrow(() -> new RuntimeException("Servicio no encontrado"));
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        pedido.setServicio(servicio);
        pedido.setUsuario(usuario);

        return pedidoRepository.save(pedido);
    }

    // delete
    public void deletePedido(Integer id) {
        pedidoRepository.deleteById(id);
    }

    // hay o no hay pedido
    public boolean existsById(Integer id) {
        return pedidoRepository.existsById(id);
    }

}
