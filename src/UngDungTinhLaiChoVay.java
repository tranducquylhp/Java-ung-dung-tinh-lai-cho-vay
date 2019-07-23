import java.util.Scanner;

public class UngDungTinhLaiChoVay {
    public static void main(String[] args) {
        double money;
        double ratePerYear;
        int month;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        money = scanner.nextDouble();
        System.out.println("Enter month: ");
        month = scanner.nextInt();
        System.out.println("Enter rate per year: ");
        ratePerYear = scanner.nextDouble();

        double tienLai = month * ratePerYear/ 100 / 12 * money;
        System.out.println("So tien lai la: "+tienLai);
    }
}
