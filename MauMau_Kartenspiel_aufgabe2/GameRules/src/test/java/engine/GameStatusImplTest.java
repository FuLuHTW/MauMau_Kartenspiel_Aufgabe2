package engine;

import impl.GameStatusImpl;
import org.junit.Test;
import static org.junit.Assert.*;
import api.GameStatus;
import api.card.api.Card;
import api.card.api.Deck;
import api.player.api.Player;

public class GameStatusImplTest {

    @Test
    public void testIsGameOver() {
        GameStatusImpl gameStatus = new GameStatusImpl();
        assertFalse("isGameOver should return false.", gameStatus.isGameOver());
    }

    @Test
    public void testGetWinner() {
        GameStatusImpl gameStatus = new GameStatusImpl();
        GameStatus gs = new GameStatus();
        Player winner = gameStatus.getWinner(gs);
        assertNull("getWinner should return null.", winner);
    }

    @Test
    public void testIncrementRound() {
        GameStatusImpl gameStatus = new GameStatusImpl();

        gameStatus.incrementRound();

        assertTrue("incrementRound should execute without exception.", true);
    }

    @Test
    public void testGetRemainingDeckSize() {
        GameStatusImpl gameStatus = new GameStatusImpl();
        Deck deck = new Deck();
        int size = gameStatus.getRemainingDeckSize(deck);
        assertEquals("getRemainingDeckSize should return 0.", 0, size);
    }

    @Test
    public void testGetTopCardOnDiscardPile() {
        GameStatusImpl gameStatus = new GameStatusImpl();
        Deck deck = new Deck();
        Card topCard = gameStatus.getTopCardOnDiscardPile(deck);
        assertNull("getTopCardOnDiscardPile should return null.", topCard);
    }
}
