package com.explnatory.learnspringframework;

import com.explnatory.learnspringframework.game.GamingConsole;
import com.explnatory.learnspringframework.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.explnatory.learnspringframework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GamingConsole.class).down();
        }
    }
}
