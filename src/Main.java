import java.util.Scanner;

public class Main {     //שלשה פיתגורית כמו a^2+b^2=c^2
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();
        System.out.print("Enter a: ");
        c = scanner.nextInt();

        //נחפש את המספר הגדול ביותר שהמשתמש הקליד
        int max = a;

        if(b > max) {
            max = b;
        }

        if(c > max){
            max = c;
        }

        if(max == a){
            boolean flag = (a * a) == ((b * b) + (c * c));
            System.out.println(flag);
        }
        else if(max == b){
            boolean flag = (b * b) == ((a * a) + (c * c));
            System.out.println(flag);
        }
        else{
            boolean flag = (c * c) == ((a * a) + (b * b));
            System.out.println(flag);
        }





    }
}

