package strategy;

public class Navigator {
  private RouteStrategy strategy;

  public Navigator(RouteStrategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(RouteStrategy strategy) {
    this.strategy = strategy;
  }

  public void buildRoute(String start, String destination) {
    strategy.buildRoute(start, destination);
  }
}
