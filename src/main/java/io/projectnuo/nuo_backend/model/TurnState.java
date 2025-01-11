package io.projectnuo.nuo_backend.model;

import lombok.Data;

@Data
public class TurnState {
    private int currentRound = 0;
    private boolean reversed = false;
    private Player currentPlayer;

}
