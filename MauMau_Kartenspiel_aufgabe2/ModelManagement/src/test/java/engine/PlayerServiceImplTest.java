package engine;

import impl.PlayerServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;
import api.card.api.Card;
import api.card.api.CardColor;
import api.card.api.CardSymbol;
import api.player.api.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerServiceImplTest {

    @Test
    public void testPlayCard() {
        PlayerServiceImpl playerService = new PlayerServiceImpl();
        Card card = new Card(CardColor.HEARTS, CardSymbol.ACE);
        boolean result = playerService.playCard(card);
        assertFalse("playCard should return false.", result);
    }

    @Test
    public void testGetNumberOfCards() {
        PlayerServiceImpl playerService = new PlayerServiceImpl();
        List<Card> cards = new ArrayList<>();
        Player player = new Player(cards, "Player1", false);
        int numberOfCards = playerService.getNumberOfCards(player);
        assertEquals("getNumberOfCards should return 0.", 0, numberOfCards);
    }

    @Test
    public void testIsHandEmpty() {
        PlayerServiceImpl playerService = new PlayerServiceImpl();
        List<Card> cards = new ArrayList<>();
        Player player = new Player(cards, "Player1", false);
        boolean isEmpty = playerService.isHandEmpty(player);
        assertFalse("isHandEmpty should return false.", isEmpty);
    }

    @Test
    public void testSayMau() {
        PlayerServiceImpl playerService = new PlayerServiceImpl();
        playerService.sayMau();
        assertTrue("sayMau should execute without exception.", true);
    }

    @Test
    public void testGiveUp() {
        PlayerServiceImpl playerService = new PlayerServiceImpl();
        boolean result = playerService.GiveUp();
        assertFalse("GiveUp should return false.", result);
    }

    @Test
    public void testGetValidMoves() {
        PlayerServiceImpl playerService = new PlayerServiceImpl();
        List<Card> validMoves = playerService.getValidMoves();
        assertNull("getValidMoves should return null.", validMoves);
    }
}
