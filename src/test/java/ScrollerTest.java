import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ScrollerTest extends Base {

    @Test
    @DisplayName("go to paydoccurr page")
    public void goToPaydoccurrPageTest() {
        mainPage.goToPaydoccurrSection();
        assertTrue("Wait for title onb is displayed", scrollerPaydoccurrPage.titleOnbVisible());
    }
}
