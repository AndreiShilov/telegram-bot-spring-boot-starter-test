package com.github.andreishilov.bot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.starter.EnableTelegramBots;

@SpringBootApplication
@EnableTelegramBots
public class TelegramBotSpringBootStarterDemoApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(TelegramBotSpringBootStarterDemoApplication.class, args);
    }
}
