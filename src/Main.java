import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задание 1");
        int[] place = new int[]{1, 2, 3};
        place[0] = 1;
        place[1] = 2;
        place[2] = 3;
        System.out.println(place[0]);
        System.out.println(place[1]);
        System.out.println(place[2]);


        //task
        System.out.println("Задание2");
        double[] weight = new double[]{1.57, 7.654, 9.986};
        weight[0] = 1.57;
        weight[1] = 7.654;
        weight[2] = 9.986;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);


        //task
        System.out.println("Задание3");
        int[] maney = new int[]{150, 500, 4000, 19000};
        maney[0] = 150;
        maney[1] = 500;
        maney[2] = 4000;
        maney[3] = 19000;
        System.out.println(maney[0]);
        System.out.println(maney[1]);
        System.out.println(maney[2]);
        System.out.println(maney[3]);


//task2
        System.out.println("задача 2");
        place = new int[]{1, 2, 3};
        weight = new double[]{1.57, 7.654, 9.986};
        maney = new int[]{150, 500, 4000, 19000};

        for (int i = 0; i < place.length; i++) {
            System.out.print(place[i]);
            if (i != place.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < maney.length; i++) {
            System.out.print(maney[i]);
            if (i != maney.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        //task3
        System.out.println("Задача3");
        int[] places = new int[]{1, 2, 3};
        weight = new double[]{9.986, 7.654, 1.57};
        maney = new int[]{19000, 4000, 500, 150};
        for (int i = places.length -1; i >= 0; i--) {
            System.out.print(places[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weight.length -1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = maney.length -1; i >= 0; i--) {
            System.out.print(maney[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("задача4");
            place = new int[]{1, 2, 3};
            for (int i = 0; i < place.length; i++) {
                if (place[i] % 2 != 0) {
                    place[i] += 1;
                }
            }
            System.out.println(Arrays.toString(place));
        }
    }

