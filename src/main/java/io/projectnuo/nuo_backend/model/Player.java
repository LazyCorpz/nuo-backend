package io.projectnuo.nuo_backend.model;

import io.projectnuo.nuo_backend.enums.PlayerStatus;
import lombok.Data;

import java.util.List;

@Data
public class Player {
    private String playerId;
    private String playerName;
    private List<Card> hand;
    private PlayerStatus playerStatus = PlayerStatus.NOT_READY;
}
