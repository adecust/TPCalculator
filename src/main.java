import java.util.Scanner;

public class main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int price;
        System.out.println("Mesafeyi km türünden giriniz :");
        int distance = input.nextInt();
        System.out.println("Yaşınızı giriniz  :");
        int age = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int type = input.nextInt();
        if(distance<0 || age<0|| type!=1 &&type!=2)
            System.out.println("hatalı tuşlama yaptınız");
        else
        {
            price = (int)(distance * 0.1);
            if (age < 12) {

                if (type == 2) {
                    price *= 2;
                    price *= 0.5;
                    price *= 0.8;//yüzde 20 indirimi temsil ediyor
                }
                else{
                    price *= 0.5;
                }

            } else if (age >= 12 && age <= 24) {
                if (type == 2) {
                    price *= 2;
                    price *= 0.9;
                    price *= 0.8;//yüzde 20 indirimi temsil ediyor
                }
                else{
                    price *= 0.9;
                }
            } else if (age > 65) {
                if (type == 2) {
                    price *= 2;
                    price *= 0.7;
                    price *= 0.8;//yüzde 20 indirimi temsil ediyor
                }
                else{
                    price *= 0.7;
                }
            }
            else if (type==2)
            {
                price*=0.8;
            }

            System.out.println("Toplam tutar : "+price);
        }

    }
}