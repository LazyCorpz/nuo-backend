package io.projectnuo.nuo_backend.model;

import io.projectnuo.nuo_backend.enums.MoveType;
import lombok.Data;

@Data
public class Move {
    private String playerId;
    private MoveType moveType;
    private Card cardPlayed;
}
