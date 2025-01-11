package io.projectnuo.nuo_backend.model;

import io.projectnuo.nuo_backend.enums.GameStatus;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class GameState {
    private String gameId;
    private String gameName;
    private List<Player> players;
    private GameStatus gameStatus;
    private GameDeck gameDeck;
    private TurnState turnState;
    private List<Move> movesHistory = new ArrayList<>();
    private Map<Player, Integer> score;
}
