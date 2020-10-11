/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author PORTOMASTER
 */
public class Luta {
       private Lutador desafiado;
       private Lutador desafiante;
       private int rounds;
       private boolean aprovado;
       
       
       public void marcarLuta(Lutador l1,Lutador l2){
           if (l1.getCategoria().equals(l2.getCategoria())
               && l1 != l2){
               this.aprovado = true;
               this.desafiado = l1;
               this.desafiante = l2;
               
           } else {
               this.aprovado = true;
              
                                               
           }
       }
       
       public void lutar(){
           if (this.aprovado){
               System.out.println("##### DESAFIADO ##### ");
               this.desafiado.apresentar();
               System.out.println("##### DESAFIANTE ##### ");
               this.desafiante.apresentar();
               
               
               Random aleatorio = new Random();
               int vencedor = aleatorio.nextInt(3);
               switch(vencedor){
                   case 0:
                       System.out.println("EMPATOU ");
                       this.desafiado.empatarLuta();
                       this.desafiante.empatarLuta();
                       break;
                   case 1:
                       System.out.println("VITORIA DO " + this.desafiado.getNome());
                       this.desafiado.ganharLuta();
                       this.desafiante.perderLuta();
                       break;
                   case 2:
                       System.out.println("VITORIA DO " + this.desafiante.getNome());
                       this.desafiado.perderLuta();
                       this.desafiante.ganharLuta();
                       break;
                       
               }
           } else {
               System.out.println("A LUTA NÃO PODE ACONTECER ");
           }
           
           
           
       }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
       
               
}
