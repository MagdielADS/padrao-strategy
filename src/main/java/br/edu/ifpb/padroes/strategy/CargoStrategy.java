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
public interface CargoStrategy {
    public BigDecimal calculaPorcetagemDesconto(Funcionario func);
}
