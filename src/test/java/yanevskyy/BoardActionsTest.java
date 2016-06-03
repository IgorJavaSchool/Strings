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

        systemInMock.provideLines("1");

        assertEquals("Не чётное", actions[0].performance());

        systemInMock.provideLines("0");

        assertEquals("Чётное", actions[0].performance());
    }

    @Test
    public void WhenTakesTwoIntegersShouldWritesSum() {
        systemInMock.provideLines("2","3.2");

        assertEquals("", actions[1].performance());

        systemInMock.provideLines("-2","3");

        assertEquals("1", actions[1].performance());
    }

    @Test
    public void WhenTakesThreeIntegersShouldWritesMin() {
        systemInMock.provideLines("-2","-3.2", "1");

        assertEquals("1.0", actions[2].performance());

        systemInMock.provideLines("-2","-3.2", "-1");

        assertEquals("-1.0", actions[2].performance());
    }

    @Test
    public void WhenTakesWordShouldCheckIsPolindrom() {
        systemInMock.provideLines("Komok");

        assertEquals("Это слово полиндром", actions[3].performance());

        systemInMock.provideLines("POTOP");

        assertEquals("Это слово полиндром", actions[3].performance());

        systemInMock.provideLines("POTO1");

        assertEquals("Не корректные данные", actions[3].performance());

        systemInMock.provideLines("POTO ");

        assertEquals("Не корректные данные", actions[3].performance());

        systemInMock.provideLines("POTO");

        assertEquals("Не корректные данные", actions[3].performance());

        systemInMock.provideLines("werty");

        assertEquals("Это слово НЕ полиндром", actions[3].performance());
    }

    @Before
    public void createActions(){
        actions = new Actions[]{new EvenNumber(), new AddsIntegers(), new MinimalModule(), new Polindrom()};
    }

}