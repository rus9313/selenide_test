package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MyTest {

    @Test
    public void test() {
        open("https://www.google.ru/");
        $(By.name("q")).setValue("Ведьмак").pressEnter();
        $(By.linkText("Ведьмак")).click();
    }
}
