package com.tennis.utils;

import com.tennis.GameState;

public class ScoreRuleUtils {

    public static GameState getNextGameState(GameState gameState, String pointWinner) {
        boolean isDeuce = gameState.isDeuce();
        return gameState;
    }
}
