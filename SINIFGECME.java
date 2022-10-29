import java.util.Scanner;
public class SINIFGECME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b , c , d , e , f ,Toplam;
        double Ortalama;
        System.out.print(" Matematik Notunu Giriniz :   ");
        a = input.nextInt();

        System.out.print(" Fizik Notunu Giriniz :   ");
        b = input.nextInt();

        System.out.print(" Kimya Notunu Giriniz :  ");
        c = input.nextInt();

        System.out.print(" Türkçe Notunu Giriniz :  ");
        d = input.nextInt();

        System.out.print(" Müzik Notunu Giriniz :   ");
        f = input.nextInt();
        if (0>a&&a>100&&0>b&&b>100&&0>c&&c>100&&0>d&&d>100&&0>f&&f>100){
            System.out.println("Yanlış Girdiniz Bir Daha Deneyiniz.");
        } else {
            System.out.print(" Not Ortalaması :    ");
            Ortalama=(a+b+c+d+f)/5.00;
            System.out.println( Ortalama );
            boolean Kosul = Ortalama > 55 ;
            String str= Kosul ? "GEÇTİ" : "KALDI" ;
            System.out.println( str );
        }
    }
}
