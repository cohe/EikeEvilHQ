package RettungVonPaco;

import java.util.Random;

public abstract class Common {
    
    protected static int getRandomInt(int max){
        Random ran = new Random();
        int number = ran.nextInt(max);
        return number;
    }
    
    protected static void endStory(Robot r, Paco p){
        if (r.health <= 0){
            System.out.println("Robbie ist kaputt.\nRettungsmission abgebrochen");
        }
        if (p.caught == false){
            System.out.println("Paco ist frei, hebt mit Robbie ab und fliegt aus dem Hauptquartier.\nRettungsmission erfolgreich");
        }
    }   
}
