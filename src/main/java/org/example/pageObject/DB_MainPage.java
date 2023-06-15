package org.example.pageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DB_MainPage extends PageObject {
    public static final Target CATEGORIES =Target.the("CATEGORIES").located(By.id("cat"));
    public static final Target LOGINBTN = Target.the("Log in").located(By.id("login2"));
    public static final Target NAMEOFUSER = Target.the("Username").located(By.id("nameofuser"));

    public static final Target ADDTOCART = Target.the("Phones").located(By.xpath("//*[text()='Add to cart']"));
    public static final Target HOME = Target.the("Home").located(By.xpath("//*[text()='Home ']"));
    public static final Target CART = Target.the("Cart").located(By.xpath("//*[@id=\"cartur\"]"));
    public static final Target PLACE_ORDER = Target.the("Place Order").located(By.xpath("//*[text()='Place Order']"));

    public static final Target CREATE_ACCOUNT_BUTTON_DNI = Target.the("Boton siguiente").locatedBy("//*[@id='wc']/main/ibk-modal/div/section/app-login/div/form/ibk-button/button");


}
