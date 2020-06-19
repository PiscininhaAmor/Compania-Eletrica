
package compania_eletric;

import javax.swing.JOptionPane;

public class Compania_Eletric {

    public static void main(String[] args) {
       
    Projeto_CompanEletric dados = new Projeto_CompanEletric();
    
    dados.setNome((JOptionPane.showInputDialog("Digite o nome do proprietário: ")));
    dados.setEndereco((JOptionPane.showInputDialog("Digite o endereço da propriedade: ")));
    dados.setLeituraAnterior(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura anterior: ")));
    dados.setLeituraAtual(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura atual: ")));
        
    dados.subtracao(dados.getLeituraAtual(),dados.getLeituraAnterior());
    dados.te1(dados.getSub());
    dados.tusd1(dados.getSub());
    dados.somatusdte(dados.getTe(),dados.getTusd());
    dados.verificarBandeira(dados.getSub());
    dados.conta(dados.getSemBandeira());
    dados.cobranca(dados.getVerificarBandeira(),dados.getConta());
    dados.impri_Conta(dados.getConta());
    dados.recibo(dados.getLeituraAtual(),dados.getLeituraAnterior(),dados.getSub(),dados.getSemBandeira(),dados.getVerificarBandeira(),dados.getBandeiraFinal());
       
    }

   
    
}
