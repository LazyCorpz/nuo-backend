package io.projectnuo.nuo_backend.model;

import io.projectnuo.nuo_backend.enums.CardColor;
import io.projectnuo.nuo_backend.enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {
    private CardType type;
    private CardColor color;
    private Integer number;

    public void validate() {
        if (type == CardType.NUMBER && number == null) {
            throw new IllegalArgumentException("Number must not be null for NUMBER cards.");
        }
        if ((type == CardType.WILD || type == CardType.WILD_DRAW_FOUR) && color != CardColor.BLACK) {
            throw new IllegalArgumentException("Color must be BLACK for WILD and WILD_DRAW_FOUR until assigned during gameplay.");
        }
    }
}
