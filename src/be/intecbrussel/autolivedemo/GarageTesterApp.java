package be.intecbrussel.autolivedemo;

public class GarageTesterApp {

    public static void main(String[] args) {
        Garage garage = new Garage("garage Bart");
        Auto auto = new Auto("Citroen Berlingo",garage);
        System.out.println(auto.toString());
    }
}
