package model;

import javax.swing.*;

public class PF {

    private String nome;
    private String endereco;
    private String fone;
    private String cpf;
    private String rg;
    private String salario;
    
    public PF() {
        this("","","","","","");
    }

    public PF(String nome, String endereco, String fone, String cpf, String rg, String salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        setEndereco(JOptionPane.showInputDialog("Digite seu endereco: "));
        setFone(JOptionPane.showInputDialog("Digite seu telefone: "));
        setCpf(JOptionPane.showInputDialog("Digite seu CPF "));
        setRg(JOptionPane.showInputDialog("Digite seu RG "));
        setSalario(JOptionPane.showInputDialog("Digite seu salario: "));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nTelefone: " + getFone()
                + "\nCNPJ: " + getCpf() + "\nRG: " + getRg() + "\nSalario: R$" + getSalario());
    }
}
