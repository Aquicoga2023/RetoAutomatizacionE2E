package org.example.pageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderForm extends PageObject {
    public static final Target NAME = Target.the("name").located(By.id("name"));
    public static final Target COUNTRY = Target.the("country").located(By.id("country"));
    public static final Target CITY = Target.the("city").located(By.id("city"));
    public static final Target CARD = Target.the("card").located(By.id("card"));
    public static final Target MONTH = Target.the("month").located(By.id("month"));
    public static final Target YEAR = Target.the("year").located(By.id("year"));
    public static final Target PURCHASE = Target.the("year").located(By.xpath("//*[text()='Purchase']"));
    public static final Target BTN_OK = Target.the("okBtn").located(By.xpath("/html/body/div[10]/div[7]/div/button"));


}
