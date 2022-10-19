import java.util.Scanner;

public class wewe2 {
    public static void main(String[] args) {
        System.out.println(" Hell0 MY Fr13ND");
        System.out.println("Pr1nT Y0ur Year");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Your Year is" + a);
        if (a % 4 == 0 || a % 400 == 0) {
            System.out.println("YES!" + a);
            System.out.print("Is vesokosniy");
        } else if (a % 4 != 0 || a % 400 != 0) {
            System.out.println("N00!" + a);
            System.out.print("iS N0t Ves0kosniy");
        }

    }


}

