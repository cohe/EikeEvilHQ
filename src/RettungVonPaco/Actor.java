package RettungVonPaco;

import java.util.ArrayList;

abstract class Actor {
    String name;
    boolean evil;
    String room;
    int health;

    Actor() {
        this.health = 100;
    }
    
    protected void move(ArrayList<Room> rooms, Actor a, Paco p){   
        int roomIndex = Common.getRandomInt(5);
        
        if (!this.room.equals(rooms.get(roomIndex).name)){
            this.room = rooms.get(roomIndex).name;
            
            if(!this.room.equals(a.room)){
                
                if(this.evil){
                    rooms.get(roomIndex).setUnlocked();
                    System.out.println(this.name + " betritt " + this.room);
                    rooms.get(roomIndex).setLocked();
                    rooms.get(roomIndex).setArmed();
                }
                else{
                    rooms.get(roomIndex).setUnlocked();
                    System.out.println(this.name + " betritt " + this.room);
                    rooms.get(roomIndex).setDisarmed();
                    if(this.room.equals("Raum mit Pacos Käfig")){
                        p.becomeFree();
                    } 
                }
            }
            else{
                this.fight(a);
            }      
        }   
    }
        
    protected void fight(Actor a){
        System.out.println(this.name + " trifft auf " + a.name + ".\nEs kommt zum Kampf!");
        if(this.health > 0 && a.health > 0){
            a.health -= Common.getRandomInt(25);
            System.out.println(a.name + " hat noch eine Gesundheit von " + a.health + "%");
        }
        if(a.health >0 && this.health > 0){
            this.health -= Common.getRandomInt(25);
            System.out.println(this.name + " hat noch eine Gesundheit von " + this.health + "%");
        }
    }
}
