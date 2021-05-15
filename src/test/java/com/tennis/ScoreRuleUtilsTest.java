package com.tennis;

import com.tennis.utils.ScoreRuleUtils;
import org.junit.Test;


import static com.tennis.Score.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;

public class ScoreRuleUtilsTest {

    @Test
    public void shouldAnswerWithTrue()
    {
        GameState gameState = new GameState(FORTY, FORTY);
        GameState expectedGameState = new GameState(FORTY, ADVANTAGE);
        GameState actualGameState = ScoreRuleUtils.getNextGameState(gameState, "B");
        assertEquals(expectedGameState,actualGameState);
    }
}
