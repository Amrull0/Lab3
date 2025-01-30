//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 14;
        int[] array = new int[a];
        System.out.println("Введите положительные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            if(array[i] < 0){
                System.out.println("Напишите только положительные числа!!!");
                i--;
            }
        }
        bubbleSort(array);
        System.out.println("Отсортированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }

    public static void bubbleSort(int[] array) {

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length - i - 1; j++) {
                        if (array[j + 1] > array[j]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }

    }
}




