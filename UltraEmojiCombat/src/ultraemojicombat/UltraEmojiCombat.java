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
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Lutador l[] = new Lutador[6];
    l[0] = new Lutador (" Pretty Boy", "França" , 31, 1.75f, 
            68.9f, 11, 2, 1);
   // l[0].apresentar();
   // l[0].status();
        System.out.println("------------------------");
    
    l[1] = new Lutador ("Putsscript", "Brasil", 29, 1.68f,57.8f,14,2,3);
    //l[1].apresentar();
    //l[1].status();
     System.out.println("------------------------");
    
    l[2] = new Lutador("Snapshadow","EUA ", 35, 1.65f,88.9f,12,2,1);
   // l[2].apresentar();
   // l[2].status();
    System.out.println("------------------------");
    
    l[3] = new Lutador("Dead Code", "Austrália",28, 1.93f,81.6f,13,8,2 );
   // l[3].apresentar();
    //l[3].status();
     System.out.println("------------------------");
 
     l[4] = new Lutador("UFOcobol", "Brasil",37, 1.70f,119.3f,5,4,3 );
    //l[4].apresentar();
   // l[4].status();
   
   System.out.println("------------------------");
    l[5] = new Lutador("Werdaart", "EUA",38, 1.81f,105.7f,12,2,4 );
    l[5].apresentar();
    l[5].status();
    
    
    }
   
    
}
