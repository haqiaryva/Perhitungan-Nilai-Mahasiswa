package TugasWeek9;

public abstract class BaseFolder {
    public String nama;
    public double attackpower;
    public String health;

    public void start(){
        System.out.println("info character");
    }
    
    public abstract void attributes();

    
}