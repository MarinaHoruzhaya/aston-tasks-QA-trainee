import java.util.Scanner;

public class Task2 {

    public static void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожайлуста, имя: ");
        String name = scanner.nextLine();

        if(name.equals("Вячеслав")){
            System.out.println("Привет Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }
        scanner.close();
    }

    public static void main(String[] args) {

        getName();
    }

}
