package lesson3;

public class Fruit {
    private double weight;
  private double quantity;


    public Fruit(double weight,double quantity) {
        this.weight =  weight;
      this.quantity = quantity;
    }

    public double weight(double weight) {
        return  weight;
    }

    public double quantity(double quantity) {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public double getQuantity() {
        return quantity;
    }
}

