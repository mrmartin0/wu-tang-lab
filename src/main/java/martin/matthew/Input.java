package martin.matthew;

import java.util.Scanner;

/**
 * Created by matthewmartin on 1/13/17.
 */
public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String askUserCurrencyType(){
        System.out.println("Enter a Currency Type: ");
        String currencyType = scanner.nextLine();
        return currencyType;
    }

    public double askUserForCurrecyAmount() {
        System.out.println("Enter currency amount:  ");
        double currencyType = scanner.nextDouble();
        return currencyType;
    }
}
