package RettungVonPaco;

public class Robot extends Actor { 
    
    Robot(String n){
        this.name = n;
        this.evil = false;
        this.room = "Outside";
        this.health /= 2;
    } 
}
