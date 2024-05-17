package engine;

import org.junit.Test;
import static org.junit.Assert.*;

import impl.DeckServiceImpl;
import impl.GameRulesImpl;
import impl.GameStatusImpl;
import impl.PlayerServiceImpl;

public class GameControllerTest {

    @Test
    public void testGameControllerInitialization() {

        PlayerServiceImpl playerService = new PlayerServiceImpl();
        DeckServiceImpl deckService = new DeckServiceImpl();
        GameRulesImpl rules = new GameRulesImpl();
        GameStatusImpl status = new GameStatusImpl();


        GameController controller = new GameController(playerService, deckService, rules, status);


        assertNotNull(controller);
    }
}
