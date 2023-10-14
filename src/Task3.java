import java.util.Scanner;

public class Task3 {
    public static void getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожайлуста, размер массива: ");
        int size = scanner.nextInt();

        int [] array = new int[size];
        System.out.println("Введите, пожалуйста элементы массива: ");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Элементы массива , кратные 3: ");
        for(int i = 0; i < size; i++){
            if(array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        getArray();
        }
    }

