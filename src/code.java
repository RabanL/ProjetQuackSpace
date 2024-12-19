public class Duck { 
    private int a, String b;

    public Duck(int c) {
        this.a = c, this.b = "NEW"; 
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
    private int a, int nb_canards, int capacite, int carburant;
    private Duck[] d;

    public Rocket(int g) {
        this.nb_canards = 10;
        this.capacite = 50;
        this.carburant = 500;
        this.d = new Duck[10];
    }

    public void loadDuck(Duck h) {
        if (h.getStatus().equals("NEW")) {
            this.nb_canards = nb_canards + 10;
        
            // log
        }
        if this.nb_canards > this.capacite {
            Rocket
    }
}

public class Mission {
    private int a;
    private Rocket b;

    public Mission(int d, Rocket e) {
        this.a = d;
        this.b = e;
        if (b = 0) {
            return FAILURE;
        else 
            return SUCCESS;
        }

    }

    public void execute() {
        if (b.getFuel() > 0) {
            b.launch();
        }
    }
}
