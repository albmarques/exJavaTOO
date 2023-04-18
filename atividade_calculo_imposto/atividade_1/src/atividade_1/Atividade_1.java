/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_1;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividade_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fatura f = new Fatura(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do consumo: ")));
        f.gerarRelatorio();
    }
    
}
