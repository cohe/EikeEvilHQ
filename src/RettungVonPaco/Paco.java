package RettungVonPaco;

public class Paco extends Actor {
    boolean caught;

    Paco() {
        this.caught = true;
    }
    
    protected void becomeFree(){
        if(Common.getRandomInt(2)==1){
            this.caught = false;
            System.out.println("Paco wurde befreit. Hallefuckingluja!");
        }
        else{
            System.out.println("Robbie zieht an der Käfigtür, aber sie klemmt noch.");
        }
    }
}
