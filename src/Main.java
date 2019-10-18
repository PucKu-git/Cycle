import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите какой цикл вы хотите и спользовать для генерации билетов for или while ");
        String s = scan.nextLine();
        if (s.equals("for")) {
            for (i = 200000;i <= 210000;i++) {
            System.out.println("Билет №" + i + " *билет сгенерирован циклом For");
            }
            for (i = 220000;i <= 235000;i++) {
            System.out.println("Билет №" + i + " *билет сгенерирован циклом For");
            }
        }else if (s.equals("while")) {
            while (i <= 210000){
                System.out.println("Билет №" + i++ + " *билет сгенерирован циклом While");
            }
            i = 220000 ;
            while (i <= 235000){
                System.out.println("Билет №" + i++ + " *билет сгенерирован циклом While");
            }
        } else
            System.out.println("Вы не правельно ввели название цикла");
    }
}
