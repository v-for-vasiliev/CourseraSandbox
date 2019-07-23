package ru.edu.coursera;

import edu.duke.URLResource;

public class Main {

    public static void main(String[] args) {
        findLinks();
    }

    private static void findLinks() {
        URLResource webPage = new URLResource(
                "https://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String word : webPage.words()) {
            if (word.contains("http://")) {
                System.out.println(word);
            }
        }
    }
}
