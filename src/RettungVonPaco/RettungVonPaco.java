package RettungVonPaco;

import java.util.ArrayList;

public class RettungVonPaco {

    public static void main(String[] args) {
        
        Villian eike = new Villian();
        Paco paco = new Paco();
        Robot robbie = new Robot("Robbie");
        
        ArrayList<Room> rooms = new ArrayList<>();
        Room room0 = new Room("Flur", "Überwachungskamera");
        Room room1 = new Room("Toilette", "Spülung");
        Room room2 = new Room("Küche", "Ofen");
        Room room3 = new Room("Schlafzimmer", "Killer-Teddybär");
        Room room4 = new Room("Raum mit Pacos Käfig", "Falltür");
        
        rooms.add(room0);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        
        int round = 0;
          
        while(robbie.health > 0 && paco.caught){    
            
            round++;
            System.out.println("Runde: " + round);
            
            robbie.move(rooms, eike, paco);
            
            if(eike.health > 0){
                eike.move(rooms, robbie, paco);  
            }         
        }   
        Common.endStory(robbie, paco);
    }   
}