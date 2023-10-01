package OOP;

public class Main2 {
    public static void main(String[] args) {
        Car2 nissan = new Car2("Nissan", 10000, 2020, "Green");
        Car2 toyota = new Car2("Toyota",10000, 2020,"Green");
        Car2 dodge = new Car2("Dodge", 11000, 2019, "Blue");
        Car2 honda = new Car2("Honda",9000, 2017, "Red");
        Car2 ford = new Car2("Ford",8000, 2016,"Blue");

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
