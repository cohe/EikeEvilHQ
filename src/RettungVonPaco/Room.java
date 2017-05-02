package RettungVonPaco;

public class Room {
    String name;
    String trap;
    boolean locked;
    boolean armed;
    
    Room(String n, String t){
        this.name = n;
        this.trap = t;
        this.locked = true;
        this.armed = true;
    }
    
    protected void setUnlocked(){
        if(this.locked){
            this.locked = false;
            System.out.println(this.name + " wurde geöffnet");
        }   
    }
    
    protected void setLocked(){
        if(!this.locked){
            this.locked = true;
            System.out.println(this.name + " wurde verschlossen");
        }   
    }
    
    protected void setDisarmed(){
        if(this.getLocked()){
            this.armed = false;
            System.out.println(this.trap + " wurde ausgeschaltet");
        }
        
    }

    protected void setArmed() {
        if(this.getArmed()){
            this.armed = true;
            System.out.println(this.trap + " wurde aktiviert");
        }
        
    }
    
    protected boolean getLocked(){
        return this.locked;
    }
    
    protected boolean getArmed(){
        return this.armed;
    }
      
}
