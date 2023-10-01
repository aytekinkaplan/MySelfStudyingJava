package OOP;

public class Main2 {
    public static void main(String[] args) {
        Car2 nissan = new Car2("Nissan", 10000, 2020, "Green");
        Car2 toyota = new Car2("Toyota",10000, 2020,"Green");
        Car2 dodge = new Car2("Dodge", 11000, 2019, "Blue");
        Car2 honda = new Car2("Honda",9000, 2017, "Red");
        Car2 ford = new Car2("Ford",8000, 2016,"Blue");

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");


        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
                ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");


        System.out.println("This " + toyota.getMake() + " is worth $" + toyota.getPrice() +
                ". It was built in " + toyota.getYear() + ". It is " + toyota.getColor() + ".\n");


        System.out.println("This " + honda.getMake() + " is worth $" + honda.getPrice() +
                ". It was built in " + honda.getYear() + ". It is " + honda.getColor() + ".\n");


        System.out.println("This " + ford.getMake() + " is worth $" + ford.getPrice() +
                ". It was built in " + ford.getYear() + ". It is " + ford.getColor() + ".\n");

    }
}
