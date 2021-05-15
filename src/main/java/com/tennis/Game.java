package com.tennis;

import com.tennis.utils.ScoreRuleUtils;

import java.util.Scanner;

import static com.tennis.Score.WIN;

public class Game {

    private Scanner scanner;
    private GameState gameState;

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    Game() {
        this(new GameState());
    }


    Game(GameState gameState) {
        this.gameState = gameState;
        scanner = new Scanner(System.in);
    }


    public void startGame() {
        System.out.println( "Starting Tennis Game between A and B");
        playGame();
        endGame();
    }

    private void endGame() {
        String winner = this.gameState.getGameWinner();
        System.out.println( "Game won by Player " + winner);
    }

    private void playGame() {
        while (this.gameState.isGameInProgress()) {
            String pointWinner = getPointWinner();
            calculateGameScore(pointWinner);
            displayGameScore();
        }
    }

    private void displayGameScore() {
        System.out.println("The Score now is: " + getGameState().getPlayerAScore() + " " + getGameState().getPlayerBScore());
    }

    private void calculateGameScore(String pointWinner) {
        GameState nextGameState = ScoreRuleUtils.getNextGameState(this.gameState, pointWinner);
        setGameState(nextGameState);
    }

    private String getPointWinner() {
        System.out.println("Who won the next point player A or B?");
        String pointWinner = scanner.nextLine();
        return pointWinner;
    }


}
