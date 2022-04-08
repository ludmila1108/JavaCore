package lesson3;

public class Box<T extends Fruit> {
    private  T master;
    private double fruitCount;

    private Box(T master) {
        this.master = master;
        this.fruitCount = fruitCount;
    }

    public T getMaster() {
        return master;
    }

    public double getFruitCount() {
        return fruitCount;
    }

    public void setMaster(T master) {
        this.master = master;
    }

    public void setFruitCount(double fruitCount) {
        this.fruitCount = fruitCount;
    }

    @Override
    public String toString() {
        return "Box{" +
                "master=" + master +
                '}';
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple());
        System.out.println("appleBox = " + appleBox.getWeight());
        Box<Orange> orangeBox = new Box<>(new Orange());
        System.out.println("orangeBox = "+ orangeBox.getWeight());

    }

    private double getWeight() {

        double boxWeight = getMaster().getQuantity() * getMaster().getWeight();
        return boxWeight;
    }

   private boolean compare(Box<?> box) {
    return  this.getWeight() == box.getWeight();

   }



}