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
public class Loader {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setCargo(Cargos.DBA);
        func.setSalario(new BigDecimal("2000"));
        System.out.println(func.calculaSalario());
    }
}
