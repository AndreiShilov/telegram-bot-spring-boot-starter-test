package com.github.andreishilov.bot.starter;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

@Component
public class TestBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            long chatId = update.getMessage().getChatId();
            SendMessage message;

            String s = update.getMessage().getText();
            if ("/start".equals(s)) {
                message = new SendMessage().setText("Start");

            } else {
                message = new SendMessage().setText("Unknown command");
            }
            try {
                message.setChatId(chatId);
                execute(message);
            } catch (TelegramApiException e) {
//                todo
            }
        }
    }


    @Override
    public String getBotUsername() {
        return "bot name goes here"; //todo
    }

    @Override
    public String getBotToken() {
        return "bot name goes here "; //todo;
    }
}

