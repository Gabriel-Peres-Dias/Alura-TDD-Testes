package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR(new BigDecimal("0.03")),
    BOM(new BigDecimal("0.15")),
    OTIMO(new BigDecimal("0.20"));

    private final BigDecimal value;

    Desempenho(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getPorcentagem() {
        return value;
    }


}
