package OOP.Examples001;

public class Main3 {
    public static void main(String[] args) {
        Car2 nissan = new Car2("Nissan", 10000, 2020, "Green");

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");

        nissan.setPrice(5000);
        nissan.setYear(2021);
        nissan.setColor("Jet Black");

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");



        /*
        Car2 toyota = new Car2("Toyota",10000, 2020,"Green");
        Car2 dodge = new Car2("Dodge", 11000, 2019, "Blue");
        Car2 honda = new Car2("Honda",9000, 2017, "Red");
        Car2 ford = new Car2("Ford",8000, 2016,"Blue");
        */
    }
}
