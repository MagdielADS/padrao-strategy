/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.strategy;

import java.math.BigDecimal;

/**
 *
 * @author Magdiel Ildefonso
 */
public enum Cargos implements CargoStrategy {

    DESENVOLVEDOR {
                public BigDecimal calculaPorcetagemDesconto(Funcionario func) {
                    return  func.getSalario().compareTo(new BigDecimal("2000")) > 0 
                            ? func.getSalario().multiply(new BigDecimal("0.15"))
                            :func.getSalario().multiply(new BigDecimal("0.10"));
                }
            },
    GERENTE {
                public BigDecimal calculaPorcetagemDesconto(Funcionario func) {
                    return func.getSalario().compareTo(new BigDecimal("3500")) > 0
                            ? func.getSalario().multiply(new BigDecimal("0.20"))
                            : func.getSalario().multiply(new BigDecimal("0.15"));
                }
            },
    DBA {
                public BigDecimal calculaPorcetagemDesconto(Funcionario func) {
                    return func.getSalario().compareTo(new BigDecimal("2000")) > 0
                            ? func.getSalario().multiply(new BigDecimal("0.15"))
                            : func.getSalario().multiply(new BigDecimal("0.10"));
                }
            },
}
