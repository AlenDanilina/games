package ru.devray.tutorial.maivendemo;
public class Games {


    @Marker
    public void poker() {
        System.out.println ("Poker " + Math.random ()*100);
    }

    @Marker
    public void roullette() {
        System.out.println ("Roulette " + Math.random ()*100);
    }

    @Marker
    public void gamemachine() {
        System.out.println ("Game machine "+ + Math.random ()*100);
    }

    @Marker
    public void blackjack() {
        System.out.println ("Blackjack "+ + Math.random ()*100);
    }

    @Marker
    public void fortunawheel() {
        System.out.println ("Fortuna wheel " + + Math.random ()*100);

    }

    @Marker
    public void bakkara() {
        System.out.println ("Bakkara " + Math.random ()*100);
    }
}
