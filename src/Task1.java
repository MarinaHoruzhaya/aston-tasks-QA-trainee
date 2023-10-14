import java.util.Scanner;

public class Task1 {
    public static void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, число: ");
        int number = scanner.nextInt();

        if(number > 7){
            System.out.println("Привет");
        }
    }

    public static void main(String[] args) {
        getNumber();
    }
}
