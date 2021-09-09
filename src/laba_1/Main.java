package laba_1;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        for(int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        System.out.println("Сгенерированный массив:");
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Отсортированный массив:");

        //sort array
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        for(int i: array) {
            System.out.print(i + " ");
        }
    }
}
