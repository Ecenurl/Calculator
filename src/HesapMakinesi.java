import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int secim ,say1 , say2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci sayi :");
        say1=sc.nextInt();
        System.out.print("ikinci sayi :");
        say2=sc.nextInt();
        System.out.print("Yapmak istediginiz islemi seciniz(1-Toplama , 2-Cıkarma , 3-Carpma , 4-Bolme ): ");
        secim=sc.nextInt();
        switch (secim){

            case 1:
                System.out.print("Toplam:" + (say1+say2));
                break;
            case 2:
                System.out.print("Cıkarma sonucu:" +(say1-say2));
                break;

            case 3:
                System.out.print("Carpma sonucu" + (say1*say2));
                break;

            case 4:
                System.out.print("Bolme sonucu:" + (say1/say2));
                break;

            default:
                System.out.print("Yanlis islem yapildi yeniden deneyiniz");
                break;
        }

    }
}
