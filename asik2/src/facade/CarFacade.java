package facade;

public class CarFacade {
  private final Battery battery = new Battery();
  private final Engine engine = new Engine();
  private final Dashboard dashboard = new Dashboard();
  private final SafetySystem safetySystem = new SafetySystem();

  public void startCar() {
    battery.check();
    safetySystem.check();
    dashboard.activate();
    engine.start();

    System.out.println("Car is ready to drive!");
  }
}
