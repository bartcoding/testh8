package be.intecbrussel.auto;

public class Garage {

    private String naam;

    public Garage(String naam){
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Garage:" + naam;
    }
}
