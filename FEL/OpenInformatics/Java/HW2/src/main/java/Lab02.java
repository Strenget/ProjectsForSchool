import java.util.Scanner;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Lab02 {

    public void StandartDev(double[] a, int n){

        double StepOne = 0;
        for(int i = 0; i < n;i++){
            StepOne+=a[i];
        }

        double StepTwo = StepOne / n;
        for(int i = 0; i < n;i++){
            a[i]= pow(a[i] - StepTwo, 2);
        }

        double StepTthree  = 0;
        for(int i = 0; i < n;i++){
            StepTthree+=a[i];
        }

        double StepFor = sqrt(StepTthree * 1/n);
        System.out.printf("\n" + n + " %.3f %.3\n", StepTwo, StepFor);
    }


    public void start(String[] args) {

        double[] a;
        a = new double[10];

        TextIO sc = new TextIO();

        int countLine = 1;
        int MassiveCount = 0;

        while(true){
            String n = sc.getLine();

            if(n == null)
                break;

            if(TextIO.isInteger(n) || TextIO.isDouble(n) || TextIO.isFloat(n)) {
                a[MassiveCount] = Double.parseDouble(n);
                MassiveCount+=1;
                if(MassiveCount == 10){
                    StandartDev(a, MassiveCount);
                    MassiveCount = 0;
                }
            }
            else
                System.out.println("A number has not been parsed from line " + countLine + "\n");

            countLine+=1;
        }

        System.out.println("End of input detected!\n");
        if(MassiveCount != 0){
            StandartDev(a,MassiveCount);
        }
    }
}