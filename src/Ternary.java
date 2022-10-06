import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
//Продажа табачных изделий до 18 лет запрещена

       /* int age=18;
        String s=age <18 ?"denied": "Legilaze";
        System.out.println(s);*/
//Строчная или заглавная

       /* System.out.printf("%d,%d,%d,%d%n", (int)'a',(int)'z',(int)'A',(int)'Z');
        System.out.printf("%d,%d,%d,%d%n", (int)'а',(int)'я',(int)'А',(int)'Я');
        char ch='=';
        String answer=(int)ch>97 && (int)ch>122?"Lowercase":
                (int)ch>65 && (int)ch>90?"uppercase": "not a letter";
        System.out.println(answer);
        // Наибольшее из трех чисел
        int a=1, b=3, c=2;
       // int max= a>b? b>c? a: a>c? a:c : a>c? b: b>c? b:c;
        int max= a>b && a>c? a:
               b>a && b>c? b:
                        c>a && c>b? c:a;
        System.out.println(max);
*/
        // угадай число
        int a2 = (int) ((Math.random() * 100 + 1));
        System.out.println(a2);
        int b2=0;
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        while (a2!=b2) {
            System.out.println("Enter a number: ");
            b2= sc.nextInt();
            if (a2>b2) {
                System.out.println("Ввводите больше");
            } else
                System.out.println("Ввводите меньше");


        }
        System.out.println("Вы угадали");






    }
}
