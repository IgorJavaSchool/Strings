package yanevskyy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

/**
 * Created by MM on 03.06.2016.
 */
public class BoardActionsTest {
    Actions[] actions;
    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    @Test
    public void WhenTakesIntegerShouldWritesEvenOrNot() {
        systemInMock.provideLines("-2");

        assertEquals("Чётное", actions[0].performance());
    }

    @Before
    public void createActions(){
        actions = new Actions[]{new EvenNumber(), new AddsIntegers(), new MinimalModule(), new Polindrom()};
    }

}