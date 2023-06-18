package pl.coderslab.seleniumexample.selectors;

import java.util.UUID;

public class Utils {
    public static String randomEmail() {
        return UUID.randomUUID().toString() + "@mail.pl";
    }
}
