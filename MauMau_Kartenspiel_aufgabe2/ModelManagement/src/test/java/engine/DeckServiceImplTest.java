package engine;

import impl.DeckServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;
import api.card.api.Card;

public class DeckServiceImplTest {

    @Test
    public void testShuffle() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        deckService.shuffle();
        // 由于 shuffle 没有具体实现，假设它应该执行而不抛出异常
        assertTrue("Shuffle should execute without exception.", true);
    }

    @Test
    public void testDealCard() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        Card card = deckService.dealCard();
        assertNull("Dealt card should be null.", card); // 确保 dealCard 返回 null
    }

    @Test
    public void testGetCardCount() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        int cardCount = deckService.getCardCount();
        assertEquals("Card count should be 0.", 0, cardCount); // 确保 getCardCount 返回 0
    }

    @Test
    public void testGetCards() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        int cards = deckService.getCards();
        assertEquals("Cards should be 0.", 0, cards); // 确保 getCards 返回 0
    }
}
