package com.cucumber.junit.pages;

import java.util.HashMap;
import java.util.Map;

public class BasePage {

    private static Map<String, String> expectedUrlList;

    static {
        expectedUrlList = new HashMap<>();
        expectedUrlList.put("Home page", "https://www.bookdepository.com/");
        expectedUrlList.put("Login page", "https://www.facebook.com/");
        expectedUrlList.put("Search page", "https://www.bookdepository.com/search?searchTerm=&search=Find+book");
    }

    public static String getExpectedUrlTitle(String string) {
        return expectedUrlList.get(string);
    }
}
