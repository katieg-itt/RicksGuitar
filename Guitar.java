public class Guitar {

  private String serialNumber;
  private double price;
  Specification spec;

  public Guitar(String serialNumber, double price, 
                Builder builder, String model, Type type,
                Wood backWood, Wood topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.spec = new Specification(builder, model, type, backWood, topWood);
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(float newPrice) {
    this.price = newPrice;
  }

  public Specification getSpec() {
    return spec;
  }
}
