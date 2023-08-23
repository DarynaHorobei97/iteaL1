package p1;

public class Car1 {


    String color;
    float weight;

    void printColorAndWeight() {
        System.out.println(color + " " + weight);
    }

     void sumOfTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Car1 car = new Car1();
        Car1 car1 = new Car1();
        car.sumOfTwoNumbers(1, 5);

    }
}
