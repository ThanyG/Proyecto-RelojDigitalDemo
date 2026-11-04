package com.iesteis.prog.ud4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
        public static void main(String[] args) {

            // Crear un reloj
            VisorReloj reloj = new VisorReloj();

            // Mostrar hora inicial
            System.out.println("Hora inicial: " + reloj.getHora());

            // Avanzar un minuto
            reloj.emitirTic();
            System.out.println("Después de un tic: " + reloj.getHora());

            // Poner una hora concreta
            reloj.ponerEnHora(10, 30);
            System.out.println("Hora configurada: " + reloj.getHora());

            // Avanzar 10 minutos
            for (int i = 0; i < 10; i++) {
                reloj.emitirTic();
            }
            System.out.println("Después de 10 minutos: " + reloj.getHora());

            // Probar el cambio de hora
            reloj.ponerEnHora(14, 59);
            reloj.emitirTic();
            System.out.println("Cambio de hora: " + reloj.getHora());

            // Probar el cambio de día
            reloj.ponerEnHora(23, 59);
            reloj.emitirTic();
            System.out.println("Cambio de día: " + reloj.getHora());
        }
    }

