package com.notificaciones;

import com.notificaciones.Notification;

public class BasicNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando notificación básica: " + message);
    }
}
