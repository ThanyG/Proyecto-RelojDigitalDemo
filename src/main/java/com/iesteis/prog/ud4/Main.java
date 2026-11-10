package com.iesteis.prog.ud4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        // Cree un reloj con el constructor por defecto
        VisorReloj reloj1 = new VisorReloj();

        // Muestro la Hora Inicial
        System.out.println("Hora inicial: " + reloj1.getHora());

        // Emito dos tics (dos minutos)
        reloj1.emitirTic();
        reloj1.emitirTic();

        System.out.println("Después de dos tics: " + reloj1.getHora());

        // Emito dos tacs (dos segundos)
        reloj1.emitirTac();
        reloj1.emitirTac();

        System.out.println("Después de dos tacs: " + reloj1.getHora());


        // Cree otro reloj con una hora concreta
        VisorReloj reloj2 = new VisorReloj();

        reloj2.ponerEnHora(10, 58, 55);

        System.out.println("Hora configurada: " + reloj2.getHora());

        // Avanzar segundos hasta cambiar de minuto
        reloj2.emitirTac();
        reloj2.emitirTac();
        reloj2.emitirTac();
        reloj2.emitirTac();
        reloj2.emitirTac();

        System.out.println("Después de cinco tacs: " + reloj2.getHora());

        // Pruebo el cambio de hora
        reloj2.ponerEnHora(14, 59, 59);

        System.out.println("Antes del cambio de hora: " + reloj2.getHora());

        reloj2.emitirTac();

        System.out.println("Después del cambio de hora: " + reloj2.getHora());


        // Pruebo el cambio de día
        reloj2.ponerEnHora(23, 59, 59);

        System.out.println("Antes del cambio de día: " + reloj2.getHora());

        reloj2.emitirTac();

        System.out.println("Después del cambio de día: " + reloj2.getHora());
    }
}


