import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int num= scanner.nextInt();
        int sum=0;
        for (int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if (sum==num){
            System.out.println(num+" mükemmel sayıdır");
        }else {
            System.out.println(num+" mükemmel sayı değildir");
        }
    }
}