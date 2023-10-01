package OOP.Examples002;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] spareParts = new String[]{"Tires", "Keys"};

        Car nissan = new Car("Nissan",10000, 2020,"Green", spareParts);
        System.out.println(nissan.getMake());
        System.out.println(nissan.getPrice());
        System.out.println(nissan.getYear());
        System.out.println(nissan.getColor());
        System.out.println(Arrays.toString(nissan.getParts()));

    }
}
