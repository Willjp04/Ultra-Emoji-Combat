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
    l[0].apresentar();
    l[0].status();
    }
    
}
