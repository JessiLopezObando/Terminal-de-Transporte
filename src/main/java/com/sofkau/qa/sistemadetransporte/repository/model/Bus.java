package com.sofkau.qa.sistemadetransporte.repository.model;

public class Bus {
    private Long placa;
    private int asientos;

    public Bus(Long placa, int asientos) {
        this.placa = placa;
        this.asientos = asientos;
    }

    public Long getPlaca() {
        return placa;
    }

    public void setPlaca(Long placa) {
        this.placa = placa;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
}
