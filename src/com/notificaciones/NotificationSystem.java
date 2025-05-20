package com.notificaciones;

import com.notificaciones.BasicNotification;
import com.notificaciones.EmailNotification;
import com.notificaciones.PushNotification;
import com.notificaciones.SMSNotification;
import com.notificaciones.Notification;

public class NotificationSystem {
    public static void main(String[] args) {
        // Crear una notificación básica
        Notification basicNotification = new BasicNotification();
        
        // Ejemplo 1: Notificación básica con email
        System.out.println("=== Ejemplo 1: Básica + Email ===");
        Notification emailNotification = new EmailNotification(basicNotification);
        emailNotification.send("¡Oferta especial!");
        
        // Ejemplo 2: Notificación básica con SMS
        System.out.println("\n=== Ejemplo 2: Básica + SMS ===");
        Notification smsNotification = new SMSNotification(basicNotification);
        smsNotification.send("¡Recordatorio de cita!");
        
        // Ejemplo 3: Combinando múltiples decoradores (Básica + Email + SMS)
        System.out.println("\n=== Ejemplo 3: Básica + Email + SMS ===");
        Notification multiNotification = new SMSNotification(new EmailNotification(basicNotification));
        multiNotification.send("¡Alerta importante!");
        
        // Ejemplo 4: Combinando todos los decoradores (Básica + Email + SMS + Push)
        System.out.println("\n=== Ejemplo 4: Básica + Email + SMS + Push ===");
        Notification allChannels = new PushNotification(new SMSNotification(new EmailNotification(basicNotification)));
        allChannels.send("¡Notificación urgente!");
    }
}