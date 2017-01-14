package martin.matthew;

import java.util.PriorityQueue;

/**
 * Created by matthewmartin on 1/13/17.
 */
public class CurrencyConverter {

    private final static double USD_RATE = 1;
    private final static double EURO_RATE = 0.94;
    private final static double BRITISH_POUND_RATE = 0.82;
    private final static double INDIAN_RUPEE_RATE = 68.32;
    private final static double AUSTRALIAN_DOLLAR_RATE = 1.35;
    private final static double CANADIAN_DOLLAR_RATE = 1.32;
    private final static double SINGAPORE_DOLLAR_RATE = 1.43;
    private final static double SWISS_FRANC_RATE = 1.01;
    private final static double MALAYSIAN_RINGGIT_RATE = 4.47;
    private final static double JAPANESE_YEN_RATE = 115.84;
    private final static double CHINESE_YAUN_RENMINBI_RATE = 6.92;

    public double convertCurrency(String currentUserCurrency, String desiredUserCurrency, double currencyAmount){

        double currentCurrencyRate = getCurrencyRate(currentUserCurrency);
        double desiredCurrencyRate = getCurrencyRate(desiredUserCurrency);

        double convertedCurrency = currencyAmount * desiredCurrencyRate / currentCurrencyRate;
//         (amountFrom * rateFrom) / rateTo ;



        return convertedCurrency;
    }

    private double getCurrencyRate(String currencyType) {
        double exchangeRate = 0;
        switch (currencyType) {
            case "usd": exchangeRate = USD_RATE;
                        break;
            case "euro": exchangeRate = EURO_RATE;
                        break;
            case "pound" : exchangeRate = BRITISH_POUND_RATE;
                        break;
            case "rupee" : exchangeRate = INDIAN_RUPEE_RATE;
                        break;
            case "aud" : exchangeRate = AUSTRALIAN_DOLLAR_RATE;
                        break;
            case "cand" : exchangeRate = CANADIAN_DOLLAR_RATE;
                break;
            case "spd" : exchangeRate = SINGAPORE_DOLLAR_RATE;
                break;
            case "franc" : exchangeRate = SWISS_FRANC_RATE;
                break;
            case "ringgit" : exchangeRate = MALAYSIAN_RINGGIT_RATE;
                break;
            case "yen" : exchangeRate = JAPANESE_YEN_RATE;
                break;
            case "yuan" : exchangeRate = CHINESE_YAUN_RENMINBI_RATE;
                break;

        }

        return exchangeRate;
    }
}
