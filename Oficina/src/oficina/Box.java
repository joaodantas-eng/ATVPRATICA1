/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina;

/**
 *
 * @author 1648403
 */
public class Box {
    private int numero;
    private String tipoServicoPermitido;
    private int capacidadeMaxima;
    private String localizacao;
    private Mecanico mecanico;
    
    public Box(int numero, String tipoServicoPermitido, int capacidadeMaxima, String localizacao, Mecanico mecanico){
        this.numero = numero;
        this.tipoServicoPermitido = tipoServicoPermitido;
        this.capacidadeMaxima = capacidadeMaxima;
        this.localizacao = localizacao;
        this.mecanico = null;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String getTipoServicoPemitido() {
        return tipoServicoPermitido;
    }
    
    public void setTipoServicoPermitido(String tipoServicoPermitido){
        this.tipoServicoPermitido = tipoServicoPermitido;
    }
    
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
    
    public void setCapacidadeMaxima(int capacidadeMaxima){
        this.capacidadeMaxima = capacidadeMaxima;
    }
    
    public String getLocalizacao(){
        return localizacao;
    }
    
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    
    public Mecanico getMecanico(){
        return mecanico;
    }
    
    public void setMecanico(Mecanico mecanico){
        this.mecanico = mecanico;
    }
    
     @Override
        public String toString() {
            return "Numero:" + numero + "Tipo de servico permitido:" + tipoServicoPermitido + "Capacidade:" + capacidadeMaxima + "Localizacao:" + localizacao + "Mecanico:" + mecanico;
            
        }
}
