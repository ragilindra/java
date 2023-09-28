import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pilih menu");
        System.out.println("1. sum");
        System.out.println("2. average");
        int pilih = scanner.nextInt();
        switch (pilih){
            case 1:
                System.out.println(sum(2,9));
                break;
            case 2:
                System.out.println(average(5,3));
                break;
            case 3:
                System.out.println(min(7,2));
            default:
                System.out.println("Menu tidak ada");
        }
    }

    public static int min(int bil1, int bil2){
        return bil1 - bil2;
    }
    public static int average(int bil1, int bil2){
        return (bil1 + bil2) / 2;
    }
    public static int sum(int bil1, int bil2) {
        return bil1 + bil2;
    }
}


