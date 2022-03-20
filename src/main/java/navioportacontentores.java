/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI Gaming
 */
public class navioportacontentores {
    public String matricula;
    public String nome;
    public float comprimento;
    public int nmcontentores;

    public navioportacontentores(String nome, float comprimento, int nmcontentores) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.nmcontentores = nmcontentores;
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

    public int getNmcontentores() {
        return nmcontentores;
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

    public void setNmcontentores(int nmcontentores) {
        this.nmcontentores = nmcontentores;
    }
    
    
}
