package hobby;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Hobby hobby = new Hobby();

        hobby.tellToUser();

        int a;
        float d;
        short b;
        double c;
        a = scanner.nextInt();
        d = scanner.nextFloat();
        b = scanner.nextShort();
        c = scanner.nextDouble();

        hobby.setHoursOnCayaks(a);
        hobby.setHoursOnBasketball(b);
        hobby.setHoursOnDance(c);
        hobby.setHoursOnVoleyball(d);

        hobby.tellAboutHobby();

    }
}
