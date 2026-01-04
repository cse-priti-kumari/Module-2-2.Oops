public class Engine {
    private double cc;
    private int cylinderCount;
    private int hp;

    Engine(double cc, int cylinderCount, int hp){
        this.cc = cc;
        this.cylinderCount = cylinderCount;
        this.hp = hp;
    }

    public double getCc(){
        return cc;
    }
    public int getCylinderCount(){
        return cylinderCount;
    }
    public int getHp(){
        return hp;
    }

    public void displayCarInfo(){
        System.out.println("Engine detils");
        System.out.println("-------------");
        System.out.println("CC: " + getCc());
        System.out.println("Cylinder Count: " + getHp());
        System.out.println("Horse Power: " + getCylinderCount());
        System.out.println();
    }
}