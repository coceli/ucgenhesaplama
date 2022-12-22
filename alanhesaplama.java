import java.util.Scanner;
public class alanhesaplama {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenar Ölçüsünü Giriniz :");
        int aKenar=input.nextInt();

        System.out.print("2.Kenar Ölçüsünü Giriniz :");
        int bKenar=input.nextInt();

        System.out.print("3. Kenar Ölçüsünü Giriniz :");
        int cKenar=input.nextInt();

        double u= (((aKenar+bKenar+cKenar) /2));
        double cevre= ((2*u));
        double alan= Math.sqrt(u*(u-aKenar)*(u-bKenar)*(u-cKenar));

        System.out.println("Üçgenin Çevresi : " +cevre );
        System.out.println("Üçgenin Alanı :" + alan);







        }

    }

