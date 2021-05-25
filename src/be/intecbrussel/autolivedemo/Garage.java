package be.intecbrussel.autolivedemo;

public class Garage {
    private String naam;

    public Garage(String naam){
        setNaam(naam);
    }
    public String getNaam(){
        return naam;
    }
    public void setNaam(String naam){
        this.naam = naam;
    }
    public String toString(){

        return "Garage: " + naam;

    }

}
