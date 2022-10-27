import org.junit.jupiter.api.RepeatedTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Tests {
    @RepeatedTest(5)
    public void onePlusOneIsTwo() {
        assertThat(1 + 1, is(2));
    }
    @RepeatedTest(5)
    public void onePlusOneIsTwo2() {
        assertThat(1 + 1, is(2));
    }
}
