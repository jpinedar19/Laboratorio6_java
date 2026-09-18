package com.hotel.ejercicio6.service;

import com.hotel.ejercicio6.model.Reserva;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReservaService {
    private final List<Reserva> reservas = new ArrayList<>();
    private Long secuencialId = 1L;

    public List<Reserva> obtenerTodas() {
        return reservas;
    }

    public Optional<Reserva> obtenerPorId(Long id) {
        return reservas.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst();
    }

    public List<Reserva> buscarPorCliente(String cliente) {
        return reservas.stream()
                .filter(r -> r.getNombreCliente().toLowerCase().contains(cliente.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Reserva guardar(Reserva reserva) {
        reserva.setId(secuencialId++);
        reservas.add(reserva);
        return reserva;
    }

    public Optional<Reserva> actualizar(Long id, Reserva reservaActualizada) {
        return obtenerPorId(id).map(r -> {
            r.setNombreCliente(reservaActualizada.getNombreCliente());
            r.setNumeroHabitacion(reservaActualizada.getNumeroHabitacion());
            r.setFechaEntrada(reservaActualizada.getFechaEntrada());
            r.setFechaSalida(reservaActualizada.getFechaSalida());
            r.setEstado(reservaActualizada.getEstado());
            return r;
        });
    }

    public boolean eliminar(Long id) {
        return reservas.removeIf(r -> r.getId().equals(id));
    }
}