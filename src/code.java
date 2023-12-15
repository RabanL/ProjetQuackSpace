public class Duck {
    private int a;
    private String b;

    public Duck(int c) {
        this.a = c;
        this.b = "NEW"; 
        int x = c + 42; 
    }

    public void markAsDamaged() {
        this.b = "DAMAGED";
    }

    public String getStatus() {
        return b;
    }

    public int getId() {
        return a;
    }
}

public class Rocket {
    private int a;
    private int b;
    private Duck[] d;

    public Rocket(int g) {
        this.a = g;
        this.b = 5;
        this.d = new Duck[5];
    }

    public void loadDuck(Duck h) {
        if (h.getStatus().equals("NEW")) {
            // log
        }
    }
}

public class Mission {
    private int a;
    private Rocket b;

    public Mission(int d, Rocket e) {
        this.a = d;
        this.b = e;
    }

    public void execute() {
        if (b.getFuel() > 0) {
            b.launch();
        }
    }
}
