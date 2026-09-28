/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina;

/**
 *
 * @author 1648403
 */
public class Servico {
    private String nome;
    private int tempoEstimado;
    private double valor;
    private String categoria;
    
    public Servico(String nome, int tempoEstimado, double valor, String categoria){
        this.nome = nome;
        this.tempoEstimado = tempoEstimado;
        this.valor = valor;
        this.categoria = categoria;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
            this.nome = nome;
    }
    
    public int getTempoEstimado() {
        return tempoEstimado;
    }
    
    public void setTempoEstimado(int tempoEstimado){
        this.tempoEstimado = tempoEstimado;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    @Override
        public String toString() {
            return "Nome:" + nome + "Tempo:" + tempoEstimado + "Valor:" + valor + "Categoria:" + categoria;
            
        }
}
