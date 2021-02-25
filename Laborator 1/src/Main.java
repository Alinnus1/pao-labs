import java.util.Scanner;

public class Main {

    // run using: java Main whatever
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);

        System.out.println("Enter n value");

        Integer n = n1.nextInt();
        for (int i = 0;i <= n;i++){
            if ((i % 2)== 0) {
                System.out.println(i);
            }

        }
    }
}
