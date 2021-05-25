package be.intecbrussel.auto;

public class Auto {

    private String merknaam;
    private Garage garage = new Garage("naamloos");

    public Auto(String merknaam, Garage garage) {
        this.merknaam = merknaam;
        this.garage = garage;
    }

    public Auto(String merknaam) {
        this.merknaam = merknaam;
    }
    public Auto(Auto auto){
        this.merknaam = auto.merknaam;
        this.garage = auto.garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public String getMerknaam() {
        return merknaam;
    }

    public Garage getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        return "Auto:" + merknaam + " Garage: " + garage;
    }
}
