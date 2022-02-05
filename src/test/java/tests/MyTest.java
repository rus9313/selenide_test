package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class MyTest {

    @Test
    public void test() {
        open("https://www.google.ru/");
        $(By.name("q")).setValue("Ведьмак").pressEnter();
        $(By.linkText("Ведьмак")).click();
        sleep(3000);

    }

    @Test
    public void test2() {
        open("https://demoqa.com/automation-practice-form");
        $(By.xpath("//input[@placeholder='First Name']")).click();
        $(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ruslan");
        sleep(5000);
    }
}
