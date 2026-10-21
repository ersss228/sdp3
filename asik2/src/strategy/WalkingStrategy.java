package strategy;

public class WalkingStrategy implements RouteStrategy {

  @Override
  public void buildRoute(String start, String destination) {
    System.out.println("Building a walking route from "
      + start + " to " + destination);
  }
}
