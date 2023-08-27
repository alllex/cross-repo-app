package org.example.app;

import org.example.lib.Library;

public class App {
    public String getGreeting() {
        return new Library().helloFromAnotherRepo("App");
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
