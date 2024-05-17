package engine;

import api.card.api.Card;
import api.card.api.Deck;
import api.player.api.Player;
import impl.DeckServiceImpl;
import impl.GameRulesImpl;
import impl.GameStatusImpl;
import impl.PlayerServiceImpl;

import java.util.List;


/**
 * Steuert den Spielablauf des Mau-Mau-Kartenspiels.
 */
public class GameController {

    private List<Player> players;

    private Deck deck;

    /**
     * Konstruktor, der den Spielcontroller mit den gegebenen Spielregeln und Spielern initialisiert.
     *
     * @param player die Spieler
     * @param deckService das Deck
     * @param rules die Regeln
     * @param status der Spielstatus
     */
    public GameController(PlayerServiceImpl player, DeckServiceImpl deckService, GameRulesImpl rules, GameStatusImpl status ) {
    }
}
