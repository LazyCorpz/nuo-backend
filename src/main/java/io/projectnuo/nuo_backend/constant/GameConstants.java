package io.projectnuo.nuo_backend.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GameConstants {
    public static final int MIN_PLAYERS = 2;
    public static final int MAX_PLAYERS = 10;
    public static final int INITIAL_HAND_SIZE = 7;
    public static final long MAX_TIME_PER_TURN_MS = 10000;
}
