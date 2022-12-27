import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void enterpriseGitHub() {
      //открыть страницу гита
      open("https://github.com/");
      //выберите меню Solutions - enterprise
      $(".HeaderMenu--logged-out").$$("ul li").findBy(text("Solutions"))
          .hover().$("a").shouldHave(text("Enterprise")).click();
      //$(".HeaderMenu--logged-out").$$("ul li").findBy(text("Solutions")).hover()
      //        .$(".HeaderMenu-dropdown").$$("ul li").findBy(text("Enterprise")).click();
      //проверка, что заголовок - "Build like the best"
      $(".h1-mktg").shouldHave(text("Build like the best"));
    }
  }
