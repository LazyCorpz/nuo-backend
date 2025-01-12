package io.projectnuo.nuo_backend.model;

import io.projectnuo.nuo_backend.enums.CardColor;
import io.projectnuo.nuo_backend.enums.CardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Data;

@Data
public class GameDeck {
    private List<Card> drawPile;
    private List<Card> discardPile;

    public void createDeck() {
        drawPile = new ArrayList<>();

        for (CardColor color : CardColor.values()) {
            if (!color.equals(CardColor.BLACK)) {
                drawPile.add(new Card(CardType.NUMBER, color, 0));
                for (int i = 1; i <= 9; i++) {
                    drawPile.add(new Card(CardType.NUMBER, color, i));
                    drawPile.add(new Card(CardType.NUMBER, color, i));
                }
                drawPile.add(new Card(CardType.SKIP, color, null));
                drawPile.add(new Card(CardType.SKIP, color, null));
                drawPile.add(new Card(CardType.REVERSE, color, null));
                drawPile.add(new Card(CardType.REVERSE, color, null));
                drawPile.add(new Card(CardType.DRAW_TWO, color, null));
                drawPile.add(new Card(CardType.DRAW_TWO, color, null));
            }
        }

        for (int i = 0; i < 4; i++) {
            drawPile.add(new Card(CardType.WILD, CardColor.BLACK, null));
            drawPile.add(
                    new Card(CardType.WILD_DRAW_FOUR, CardColor.BLACK, null));
        }

        shuffleDeck();
    }

    public void shuffleDeck() {
        Collections.shuffle(drawPile);
    }

    public void reshuffleDiscardIntoDrawPile() {
        if (drawPile.isEmpty()) {
            drawPile.addAll(discardPile);
            discardPile.clear();
            shuffleDeck();
        }
    }
}
