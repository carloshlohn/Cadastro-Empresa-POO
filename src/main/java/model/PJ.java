package model;

import javax.swing.JOptionPane;



public class PJ {
    
    private String nome;
    private String endereco;
    private String fone;
    private String cnpj;
    private String ie;
    private String faturamento;
    
    public PJ() {
        this("","","","","","");
    }

    public PJ(String nome, String endereco, String fone, String cnpj, String ie, String faturamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.cnpj = cnpj;
        this.ie = ie;
        this.faturamento = faturamento;
    }

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

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        setEndereco(JOptionPane.showInputDialog("Digite seu endereco: "));
        setFone(JOptionPane.showInputDialog("Digite seu telefone: "));
        setCnpj(JOptionPane.showInputDialog("Digite seu CNPJ: "));
        setIe(JOptionPane.showInputDialog("Digite seu I.E: "));
        setFaturamento(JOptionPane.showInputDialog("Digite seu faturamento: "));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nTelefone: " + getFone()
                + "\nCNPJ: " + getCnpj() + "\nI.E: " + getIe() + "\nFaturamento: R$" + getFaturamento());
    }
}
