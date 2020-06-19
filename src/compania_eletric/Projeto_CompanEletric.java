
package compania_eletric;

import javax.swing.JOptionPane;

public class Projeto_CompanEletric {
    
    private String nome;
    private String endereco;
    private double leituraAtual;
    private double leituraAnterior;
    private double tusd;
    private double te;
    private double conta;
    private double sub;
    private double cobranca;
    private String verBandeira;
    private double semBandeira;
    private double comBandeira;
    
    public String getNome() {
    return nome;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }
    
    public String getEndereco() {
    return endereco;
    }

    public void setEndereco(String endereco) {
    this.endereco = endereco;
    }
    
    public double getLeituraAtual() {
    return leituraAtual;
    }

    public void setLeituraAtual(double leituraAtual) {
    this.leituraAtual = leituraAtual;
    }
    
    public double getLeituraAnterior() {
    return leituraAnterior;
    }

    public void setLeituraAnterior(double leituraAnterior) {
    this.leituraAnterior = leituraAnterior;
    }
    
    public double getTusd() {
    return tusd;
    }

    public void setTusd(double tusd) {
    this.tusd = tusd;
    }
    
    public double getTe() {
    return te;
    }

    public void setTe(double te) {
    this.te = te;
    }
    
    public double getConta() {
    return conta;
    }

    public void setConta(double conta) {
    this.conta = conta;
    }
    
    public double getSub() {
    return sub;
    }

    public void setSub(double sub) {
    this.sub = sub;
    }
    
    public double getCobranca() {
    return cobranca;
    }

    public void setCobranca(double cobranca) {
    this.cobranca = cobranca;
    }
    
    public String getVerificarBandeira() {
    return verBandeira;
    }

    public void setVerificarBandeira(String verBandeira) {
    this.verBandeira = verBandeira;
    }
    
    public double getSemBandeira() {
    return semBandeira;
    }

    public void setSemBandeira(double semBandeira) {
    this.semBandeira = semBandeira;
    }

    public double getComBandeira() {
    return comBandeira;
    }

    public void setComBandeira(double comBandeira) {
    this.comBandeira = comBandeira;
    }
    
    public double getBandeiraFinal() {
    return comBandeira;
    }

    public void setTotalBandeira(double bandeiraFinal) {
    this.comBandeira = bandeiraFinal;
    }
    
    public double subtracao(double leituraAnterior, double leituraAtual){    
    this.sub = this.leituraAtual - this.leituraAnterior;
    return this.sub;        
    }
        
    public double tusd1(double sub){
    this.tusd = this.sub * 0.30;
    return this.tusd;
    }
        
    public double te1(double sub){
    this.te = this.sub * 0.29;
    return this.te;
    } 
    
    public double somatusdte(double tusd, double te){
    this.semBandeira = this.tusd + this.te;
    return this.semBandeira;
    }
    
    public double conta(double semBandeira){
    this.conta = this.semBandeira * 0.25;
    this.conta = this.conta + this.semBandeira;
    return conta;
    }
    
    public String verificarBandeira(double sub){
        if (this.sub < 100) {
            this.verBandeira = "Verde";
        }
        else if (this.sub > 101 && this.sub < 150) {
            this.verBandeira = "Amarelo";
        }
        else if (this.sub > 150 && this.sub < 200) {
            this.verBandeira = "Vermelho primeiro patamar";
        }
        else {
            this.verBandeira = "Vermelho segundo patamar";
        }
    return this.verBandeira;
    }
    
    public double cobranca(String verBandeira, double conta){
        if ("Verde".equals(this.verBandeira)) {
            this.cobranca = 1;
        }
        
        if ("Amarelo".equals(this.verBandeira)) {
            this.cobranca = 0.04169;
        }
        
        if ("Vermelho primeiro patamar".equals(this.verBandeira)) {
            this.cobranca = 0.04169;
        }
        
        if ("Vermelho segundo patamar".equals(this.verBandeira)) {
            this.cobranca = 0.06243;
        }
    return this.cobranca;
    }
    
    public double impri_Conta(double conta){
    this.comBandeira = this.conta * this.cobranca;
    this.comBandeira = this.comBandeira+this.conta;
    return this.comBandeira;
    }
    
    void recibo(double leituraAtual, double leituraAnterior, double sub, double
    semBandeira, String verBandeira, double fimBandeira)
    {JOptionPane.showMessageDialog(null,"Propretário: " + this.nome +
    "\nEndereço da propriedade: " + this.endereco + "\nLeitura antiga: " +
    this.leituraAnterior + "\nLeitura atual: " + this.leituraAtual + "\nTotal: " + this.sub
    + "\nBandeira: " + this.verBandeira + "\nTotal (sem bandeira): " + this.semBandeira
    + "\nTotal (com bandeira): " + this.comBandeira);
    
    }

}
    
