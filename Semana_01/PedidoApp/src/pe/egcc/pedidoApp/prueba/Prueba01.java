/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pedidoApp.prueba;

import pe.egcc.pedidoApp.service.PedidoService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    
    public static void main(String[] args){
        PedidoService service;
        service = new PedidoService();
        double importe = 8945.70;
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + service.calcularImpuesto(importe));
        System.out.println("Total: " + service.calcularTotal(importe));
    }
}
