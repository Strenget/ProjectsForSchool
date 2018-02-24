
import java.util.Scanner;

public class Lab01 {

    public void start(String[] args){
        System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a < 1 || a > 4)
            System.out.println("Chybna volba!\n");

        else {
            String phrase = "Zadej pocet desetinnych mist:";

            if (a == 1) {
                System.out.println("Zadej scitanec:");
                float b = sc.nextFloat();
                System.out.println("Zadej scitanec:");
                float c = sc.nextFloat();
                System.out.println(phrase);
                int d = sc.nextInt();
                if(d < 0)
                    System.out.println("Chyba - musi byt zadane kladne cislo!\n");
                else
                    System.out.printf("%." + d + "f + %." + d + "f = %." + d + "f\n", b, c, b + c);
            } else if (a == 2) {
                System.out.println("Zadej mensenec:");
                float b = sc.nextFloat();
                System.out.println("Zadej mensitel:");
                float c = sc.nextFloat();
                System.out.println(phrase);
                int d = sc.nextInt();
                if(d < 0)
                    System.out.println("Chyba - musi byt zadane kladne cislo!\n");
                else
                    System.out.printf("%." + d + "f - %." + d + "f = %." + d + "f\n", b, c, b - c);
            } else if (a == 3) {
                System.out.println("Zadej cinitel:");
                float b = sc.nextFloat();
                System.out.println("Zadej cinitel:");
                float c = sc.nextFloat();
                System.out.println(phrase);
                int d = sc.nextInt();
                if(d < 0)
                    System.out.println("Chyba - musi byt zadane kladne cislo!\n");
                else
                    System.out.printf("%." + d + "f * %." + d + "f = %." + d + "f\n", b, c, b * c);
            } else {
                System.out.println("Zadej delenec:");
                float b = sc.nextFloat();
                System.out.println("Zadej delitel:");
                float c = sc.nextFloat();
                if (c == 0) {
                    System.out.println("Pokus o deleni nulou!\n");
                } else {
                    System.out.println(phrase);
                    int d = sc.nextInt();
                    if(d < 0)
                        System.out.println("Chyba - musi byt zadane kladne cislo!\n");
                    else
                        System.out.printf("%." + d + "f / %." + d + "f = %." + d + "f", b, c, b / c);
                }
            }
        }
    }
}


