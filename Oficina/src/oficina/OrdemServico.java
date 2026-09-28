/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina;

/**
 *
 * @author 1648403
 */
import java.time.LocalDate;

public class OrdemServico {
    
    private int codigo;
    private String nomeCliente;
    private String modeloVeiculo;
    private String placaVeiculo;
    private LocalDate data;
    private StatusOrdem status;
    private double valorEstimado;
    private Servico servico;
    private Box box;
    
    public OrdemServico(int codigo, String nomeCliente, String modeloVeiculo, String placaVeiculo, LocalDate data, StatusOrdem status, double valorEstimado, Servico servico){
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.data = data;
        this.status = status;
        this.valorEstimado = valorEstimado;
        this.servico = servico;
        this.box = null;
    }
    
     public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }
    
    public void setPlacaVeiculo(String PlacaVeiculo){
        this.placaVeiculo = placaVeiculo;
    }
    
}
