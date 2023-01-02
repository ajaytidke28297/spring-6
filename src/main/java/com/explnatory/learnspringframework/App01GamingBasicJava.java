package com.explnatory.learnspringframework;

import com.explnatory.learnspringframework.game.GameRunner;
import com.explnatory.learnspringframework.game.GamingConsole;
import com.explnatory.learnspringframework.game.PacMan;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        GamingConsole game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
