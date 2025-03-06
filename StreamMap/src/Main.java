import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        Stream<Locale> locale = Stream.of(Locale.getAvailableLocales());
        Map<String, String> languagesMap = locale.collect(
                Collectors.toMap(
                        Locale::getDisplayLanguage,
                        loc -> loc.getDisplayLanguage(),

                )
        )
    }
}