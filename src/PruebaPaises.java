import java.util.Locale;

public class PruebaPaises {
    public static void main(String[] args) {

        PruebaPaises obj = new PruebaPaises();
        obj.run();

    }

    public void run() {

        String[] locales = Locale.getISOCountries();

        for (String countryCode : locales) {

            Locale obj = new Locale("", countryCode);

            System.out.println("Country Code = " + obj.getCountry()
                    + ", Country Name = " + obj.getDisplayCountry());

        }

        System.out.println("Done");
    }
}
