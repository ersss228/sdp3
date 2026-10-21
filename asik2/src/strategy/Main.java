package strategy;

public class Main {
  public static void main(String[] args) {

    Navigator navigator = new Navigator(new CarStrategy());
    navigator.buildRoute("Astana", "Almaty");

    System.out.println("--- Changing strategy ---");

    navigator.setStrategy(new WalkingStrategy());
    navigator.buildRoute("Astana", "Almaty");

    navigator.setStrategy(new CyclingStrategy());
    navigator.buildRoute("Astana", "Almaty");
  }
}
