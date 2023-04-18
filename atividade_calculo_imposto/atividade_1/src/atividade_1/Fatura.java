/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_1;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Fatura {
    double consumo;
    double fornecimento;
    double fatura;
    double icms;
    double fatorIcms;
    double cofins;
    double fatorCofins;
    double pis_pasep;
    double fatorPis_pasep;
    double icms_cofins;
    double icms_pasep;
    
     
     
    public Fatura() {}

    public Fatura(double consumo) {
        this.consumo = consumo;
        gerarForncecimento();
        gerarIcms();
        gerarConfins();
        gerarPisPasep();
        gerarIcmsCofins();
        gerarIcmsPisPasep();
        gerarFatura();
    }
    
    void gerarForncecimento(){
    fornecimento = consumo*0.28172;
    }
    
    void gerarIcms(){
    if(consumo<=200 && consumo>0)fatorIcms=0.136363;
    else if(consumo>200)fatorIcms=0.333333;
    icms = fornecimento*fatorIcms;
    }
    
    void gerarConfins(){
    if(consumo<=200 && consumo>0)fatorCofins=0.0614722;
    else if(consumo>200)fatorCofins=0.0730751;
    cofins = fornecimento*fatorCofins;
    }
    
    void gerarPisPasep(){
    if(consumo<=200 && consumo>0)fatorPis_pasep=0.013346;
    else if(consumo>200)fatorPis_pasep=0.0158651;
    pis_pasep = fornecimento*fatorPis_pasep;
    }
    
    void gerarIcmsCofins(){
    icms_cofins=fatorCofins*fatorIcms*fornecimento;
    }
    void gerarIcmsPisPasep(){
    icms_pasep=fatorPis_pasep*fatorIcms*fornecimento;
    }
    
    void gerarFatura(){
    fatura = (fornecimento + icms + cofins + pis_pasep + icms_cofins + icms_pasep);
    }
    
    void gerarRelatorio(){
        JOptionPane.showMessageDialog(null, "Consumo: "+consumo+"\n"+
        "Fornecimento: "+fornecimento+"\n"+
        "Icms: "+icms+"\n"+
        "Cofins: "+cofins+"\n"+
        "Pis/Pasep: "+pis_pasep+"\n"+
        "Icms Cofins: "+icms_cofins+"\n"+
        "Icms Pis/Pasep: "+icms_pasep+"\n"+
        "Valor da fatura: "+fatura);
    }
}
