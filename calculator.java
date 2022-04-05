import java.util.Scanner;

public class calculator {

    static int mod(int a, int b) {
        int result = a % b;
        System.out.print(result);
        return a % b;

    }

    static void rectangle(int a, int b) {
        System.out.println("Çevresi :" + (2 * (a + b)));
        System.out.println("Alanı :" + (a * b));
    }

    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        System.out.print("1-Mod Hesabı\n" + "2-Dikdörtgen Hesabı\n" + "0- Çıkış\n");
        while (true) {

            int select;
            System.out.print("İşlemi Seçiniz :");
            select = calc.nextInt();

            if (select == 0) {
                System.out.print("Çıkış Yaptınız. Tekrar Görüşmek Üzere.");

                break;
            }
            System.out.print("İlk Sayı :");
            int a = calc.nextInt();

            System.out.print("İkinci Sayı :");
            int b = calc.nextInt();

            switch (select) {
                case 1:
                    mod(a,b);
                    break;
                case 2:
                    rectangle(a, b);
                    break;
            }
            System.out.println();
        }


    }
}
