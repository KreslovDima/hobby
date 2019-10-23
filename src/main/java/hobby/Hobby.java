package hobby;

import java.util.Scanner;

public class Hobby {
    Scanner scanner = new Scanner(System.in);
    String cayaks = "Cayaks";
    private  int hoursOnCayaks;
    String voleyball = "Voleyball";
    private  float hoursOnVoleyball;
    String basketball = "Basketball";
    private short hoursOnBasketball;
    String dance = "Dance";
    private double hoursOnDance;

    public void tellAboutHobby(){
        System.out.println(cayaks+" "+hoursOnCayaks);
        System.out.println(voleyball+" "+hoursOnVoleyball);
        System.out.println(basketball+" "+hoursOnBasketball);
        System.out.println(dance+" "+hoursOnDance);
    }

    public Hobby(){
    }

    public int getHoursOnCayaks() {
        return hoursOnCayaks;
    }

    public void setHoursOnCayaks(int hoursOnCayaks) {
        this.hoursOnCayaks = hoursOnCayaks;
    }

    public float getHoursOnVoleyball() {
        return hoursOnVoleyball;
    }

    public void setHoursOnVoleyball(float hoursOnVoleyball) {
        this.hoursOnVoleyball = hoursOnVoleyball;
    }

    public short getHoursOnBasketball() {
        return hoursOnBasketball;
    }

    public void setHoursOnBasketball(short hoursOnBasketball) {
        this.hoursOnBasketball = hoursOnBasketball;
    }

    public double getHoursOnDance() {
        return hoursOnDance;
    }

    public void setHoursOnDance(double hoursOnDance) {
        this.hoursOnDance = hoursOnDance;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "cayaks='" + cayaks + '\'' +
                ", voleyball='" + voleyball + '\'' +
                ", basketball='" + basketball + '\'' +
                ", dance='" + dance + '\'' +
                '}';
    }
}
