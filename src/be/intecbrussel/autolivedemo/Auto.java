package be.intecbrussel.autolivedemo;

public class Auto {

    private String merknaam;
    private Garage garage = new Garage("garage niet gekend");

    public Auto(String merknaam){
        this.merknaam = merknaam;
    }
    public Auto(String merknaam, Garage garage){
        this.merknaam = merknaam;
        this.garage = garage;
    }

    public Auto(Auto auto){
        this(auto.merknaam, auto.garage);
    }

    public String getMerknaam(){
        return merknaam;
    }

    public Garage getGarage(){
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public String toString(){
        return "Auto: " + merknaam + " " + garage.toString();

    }
}
