import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Homework4 {
    @Test
    public void Homework4(){
    open("https://zoommer.ge/");
    $("#small-searchterms").shouldBe(Condition.visible).click();
    $("#clear-basket-button");
    $(byText("ფილიალები")).click();
    $(byName("Address"));
    $("#googleMap").click();
    $(byText("შეიყვანეთ მისამართი")).shouldNot(Condition.visible);
    open("https://zoommer.ge/");
    $(byLinkText("<a href=https://zoommer.ge/mobilurebi-2?orderby=30"));
    $(byClassName("n-cart-title")).shouldNot(Condition.visible);

    ElementsCollection collection = $$(byClassName("product_blocks"));
    int count = collection.size();
    for(int i=0; i<count; i++);
    System.out.println(count);

    sleep(2000);


    }
}
