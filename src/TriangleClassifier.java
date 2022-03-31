import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        System.out.println("Nhap b:");
        int b = sc.nextInt();
        System.out.println("Nhap c:");
        int c = sc.nextInt();

    }

    public static String Triangle(int a, int b, int c){
        //Xet Triangle;
        if (a+b>c && a+c>b && b+c>a){
            if (a==b && b==c){
                return "Tam Giac Deu";
            }
        }
        return "";
    }


}
