package OOP.Examples001;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.make = "Nissan";
        nissan.price = 10000;
        nissan.year = 2020;
        nissan.color = "Green";

        Car dodge = new Car();
        dodge.make = "Dodge";
        dodge.price = 11000;
        dodge.year = 2019;
        dodge.color = "Blue";

        Car toyota = new Car();
        toyota.make = "Toyota";
        toyota.price = 10000;
        toyota.year = 2020;
        toyota.color = "Green";

        Car honda = new Car();
        honda.make = "Honda";
        honda.price = 9000;
        honda.year = 2017;
        honda.color = "Red";

        Car ford = new Car();
        ford.make = "Ford";
        ford.price = 8000;
        ford.year = 2016;
        ford.color = "Blue";


        System.out.println("This " + nissan.make + " is worth $" + nissan.price +
                ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");


        System.out.println("This " + dodge.make + " is worth $" + dodge.price +
                ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");


        System.out.println("This " + toyota.make + " is worth $" + toyota.price +
                ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");


        System.out.println("This " + honda.make + " is worth $" + honda.price +
                ". It was built in " + honda.year + ". It is " + honda.color + ".\n");


        System.out.println("This " + ford.make + " is worth $" + ford.price +
                ". It was built in " + ford.year + ". It is " + ford.color + ".\n");
    }
}