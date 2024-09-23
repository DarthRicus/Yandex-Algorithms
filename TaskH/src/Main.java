import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] dataToParse = data.split(" ");
        double l = Double.parseDouble(dataToParse[0]);
        double x1 = Double.parseDouble(dataToParse[1]);
        double v1 = Double.parseDouble(dataToParse[2]);
        double x2 = Double.parseDouble(dataToParse[3]);
        double v2 = Double.parseDouble(dataToParse[4]);
        if(v1 == 0 && v2 == 0){
            System.out.println("NO");
            return;
        }
        if(v1 < 0 && v2 < 0 ){
            v1 = v1 * (-1);
            v2 = v2 * (-1);
        }
        double t1 = -1;
        double t2 = -1;
        if(v1 + v2 != 0){
            t1 = (l - x1 -x2) / (v1 + v2);
        }
        if(v1 - v2 != 0){
            t2 = (x2 - x1) / (v1 - v2);
        }
        if(t1 < 0){
            System.out.println("YES");
            System.out.println(String.format(Locale.US,"%.10f",t2));
            return;
        }
        if(t2 < 0){
            System.out.println("YES");
            System.out.println( String.format(Locale.US,"%.10f",t1));
            return;
        }
        if(t1 > t2){
            System.out.println("YES");
            System.out.println(String.format(Locale.US,"%.10f",t2));
            return;
        }
        if(t1 < t2){
            System.out.println("YES");
            System.out.println(String.format(Locale.US,"%.10f",t1));
        }
    }
}