package com.explnatory.learnspringframework;

import com.explnatory.learnspringframework.game.GameRunner;
import com.explnatory.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
