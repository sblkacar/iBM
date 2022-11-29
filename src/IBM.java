import java.util.Scanner;

public class IBM {
    public static void main(String[] args) {
        double boy,kilo,ıbm;
        Scanner input=new Scanner(System.in);
        System.out.println("Boyunzu M cinsinden giriniz: ");
        boy=input.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        kilo=input.nextDouble();
        ıbm=kilo/(boy*boy);
        System.out.println("VUCUT KİTLE İNDEXSİNİZ "+ ıbm);




    }
}
