package engine;

import org.junit.Test;
import static org.junit.Assert.*;
import impl.GameRulesImpl;

public class GameRulesImplTest {

    @Test
    public void testGameRuleMethod() {
        GameRulesImpl rules = new GameRulesImpl();

        boolean result = rules.isGameOver();
        assertFalse(result);


    }
}
