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
public class Funcionario {

    private BigDecimal salario;
    private Cargos cargo;

    public BigDecimal getSalario() {
        return salario;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
    
    public BigDecimal calculaSalario(){
        return this.salario.subtract(this.cargo.calculaPorcetagemDesconto(this));
    }

}
