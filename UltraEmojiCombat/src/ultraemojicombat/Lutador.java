/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author PORTOMASTER
 */
public class Lutador {
    //ATRIBUTOS
   private String nome;
   private String nacionalidade;
   private int idade;
   private float altura,peso;
   private String categoria;
   private int vitorias,derrotas,empate;
            

    public void apresentar(){
        System.out.println("CHEGOU A HORA ! Apresentamos o lutador " + this.getNome() );
        System.out.println("Diretamente de" + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + "Anose e " + this.getAltura());
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + "Vitórias");
        System.out.println(this.getDerrotas() + "Derrotas ");
        System.out.println(this.getEmpate() + "Empates");
}   
    public void status(){
        System.out.println("É UM PESO " + this.getCategoria());
        System.out.println("GANHOU " + this.getVitorias() + "VEZES ");
        System.out.println("PERDEU " + this.getDerrotas() + "VEZES ");
        System.out.println("EMPATOU " + this.getDerrotas() + "VEZES ");
   
                
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
        
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
        
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
        
    }

    public Lutador(String no, String na, int id, float al, float pe, String ca, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.categoria = ca;
        this.vitorias = vi;
        this.derrotas = de;
        this.empate = em;
    }
    
   
    public String getNome() {
        return nome;
    }
     

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade(){
       return this.nacionalidade;
        
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if(this.peso <=52.2){
            this.categoria = "INVÁLIDO";
            
          } else if (this.peso <= 70.3){
            this.categoria = "LEVE";
              
           } else if (this.peso <= 83.9){
               this.categoria = "MÉDIO";
           } else if (this.peso <= 120.2){
               this.categoria = "PESADO";
           } else {
               this.categoria = "INVÁLIDO";
           }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    
    
    


}

