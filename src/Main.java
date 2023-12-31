public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int [] numbers1 = new int [3];
        numbers1 [0] = 1;
        numbers1 [1] = 2;
        numbers1 [2] = 3;
        double [] numbers2 = {1.57, 7.654, 9.986};
        int [] numbers3 = {10, 11, 12, 13, 14};

        System.out.println("Задача 2");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + ", ");
        }  System.out.println();
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + ", ");
        }  System.out.println();
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + ", ");
        }  System.out.println();

        System.out.println("Задача 3");
        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.print(numbers1[i] + ", ");
        }  System.out.println();
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i] + ", ");
        }  System.out.println();
        for (int i = numbers3.length - 1; i >= 0 ; i--) {
            System.out.print(numbers3[i] + ", ");
        }  System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < numbers1.length; i++) {
            if (i % 2 != 0){
                System.out.print(numbers1[i] + " ");
            }else{
                numbers1[i] = numbers1[i] + 1;
                System.out.print(numbers1[i] + " ");
            }
        }

    }
}