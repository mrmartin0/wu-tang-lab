package martin.matthew;

/**
 * Created by matthewmartin on 1/13/17.
 */
public class Logic {

    private CurrencyConverter currencyConverter;
    private Input input;

    public Logic() {
        currencyConverter = new CurrencyConverter();
        input = new Input();
    }

    public void run() {
        String currentCurrencyType = input.askUserCurrencyType();
        System.out.println("Desired Currency");
        String desiredCurrencyType = input.askUserCurrencyType();
        double currencyAmount = input.askUserForCurrecyAmount();

        double convertedAmount = currencyConverter.convertCurrency(currentCurrencyType, desiredCurrencyType, currencyAmount);

        System.out.println("Your new currency value is " + convertedAmount);

    }
}
