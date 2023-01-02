package com.explnatory.learnspringframework;

import com.explnatory.learnspringframework.game.GameRunner;
import com.explnatory.learnspringframework.game.GamingConsole;
import com.explnatory.learnspringframework.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext()) {

//            GamingConsole game = new PacMan();
//            var gameRunner = new GameRunner(game);
//            gameRunner.run();
        }
    }
}
