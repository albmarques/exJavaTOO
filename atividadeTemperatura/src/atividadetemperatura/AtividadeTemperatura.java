/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadetemperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class AtividadeTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] listTemp  = new double[7];
        double soma = 0, media = 0;
        int diasAcima = 0, diasAbaixo =0;
        
        for (int i = 0; i < listTemp.length; i++) {
            listTemp[i]= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a "+(i+1)+"° temperatura"));
            soma+=listTemp[i];
        }
        media = soma/listTemp.length;
        for (int i = 0; i < listTemp.length; i++) {
            if(listTemp[i]>media){
                diasAcima++;
            }
            else if(listTemp[i]<media){
                diasAbaixo++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Media "+media+
                "\n Número de dias acima: "+diasAcima+
                "\n Número de dias abaixo "+diasAbaixo);
        
       
    }
    
}
