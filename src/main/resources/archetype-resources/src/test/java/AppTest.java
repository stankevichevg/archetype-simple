package $package;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.internal.matchers.ThrowableCauseMatcher.hasCause;
import static org.junit.internal.matchers.ThrowableMessageMatcher.hasMessage;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void sqrtShouldReturnSquaredRootOfValue() {
        final App app = new App();
        assertThat(app.sqrt(4.0), is(Math.sqrt(4.0)));
        assertThat(app.sqrt(5.0), is(Math.sqrt(5.0)));
    }

    @Test
    public void sqrtShouldConsiderNegativeValueAsIllegalArgument() {
        exception.expect(
                allOf(
                        isA(IllegalArgumentException.class),
                        hasMessage(is("Value should be non negative")),
                        hasCause(nullValue(Exception.class))
                )
        );
        final App app = new App();
        app.sqrt(-1);
    }

}
