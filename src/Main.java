import java.text.NumberFormat;
import java.util.Locale;


public class Main {


    public static void main(String[] args) {

        int var = 20;

        double RandomValue = 0.10;
        double price = 11.4589089;

        //Currency sign added to display
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String CurrencyString = currency.format(price);
        System.out.println(CurrencyString);

        //set precision to 3
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(3);
        String NewValue = formatter.format(price);
        System.out.println(NewValue);

        //Local currency (in canadian style/format)
        NumberFormat LocalCurrency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        String LocalCurrencyString = LocalCurrency.format(price);
        System.out.println(LocalCurrencyString);

        //Change value = 0.10 to 10%
        NumberFormat Percentage = NumberFormat.getPercentInstance();
        String PercentageString = Percentage.format(RandomValue);
        System.out.println(PercentageString);

        //Type casting (int to string)
        String StringVar = Integer.toString(var);
        System.out.println(StringVar);


        System.out.println("Hello World!");

    }


}


