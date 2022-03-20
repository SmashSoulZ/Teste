/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI Gaming
 */
public class naviopetroleiro {
    public String matricula;
    public String nome;
    public float comprimento;
    public float capacidade;

    public naviopetroleiro(String nome, float comprimento, float capacidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.capacidade = capacidade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
