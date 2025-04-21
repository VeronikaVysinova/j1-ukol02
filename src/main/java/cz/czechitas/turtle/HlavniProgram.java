package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        // nakresliRovnostrannyTrojuhelnik(50, Color.CYAN);

        // nakresliCtverec(50,Color.MAGENTA);

        // nakresliObdelnik(50,80,Color.ORANGE);

        // nakresliKruh(20,15,25, Color.GREEN);

        // nakresliRovnoramennyTrojuhelnik(80,60, Color.RED);



        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(350);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliZmrzlinu(30, 100, Color.orange);

        zofka.penUp();
        zofka.turnRight(72);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliSnehulaka();

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(28);
        zofka.penDown();

        nakresliVlak();


    }

    //rovnostranny trojuhelnik
    public void nakresliRovnostrannyTrojuhelnik(double delkaStrany, Color penColor) {

        zofka.setPenColor(penColor);
        zofka.turnRight(30);
        zofka.move(delkaStrany);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
            zofka.move(delkaStrany);
        }

    }

    // ctverec
    public void nakresliCtverec(double delkaStrany, Color penColor) {

        zofka.setPenColor(penColor);

        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    //obdelnik
    public void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color penColor) {
        zofka.setPenColor(penColor);

        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

    //kruh
    public void nakresliKruh(double delkaKroku, double uhel, int pocetOpakovani, Color penColor) {

        zofka.setPenColor(penColor);

        int Opakovani = pocetOpakovani;
        for (int i = 0; i < pocetOpakovani; i++) {
            zofka.turnRight(uhel);
            zofka.move(delkaKroku);
        }
    }

    //rovnoramenny trojuhelnik
    public void nakresliRovnoramennyTrojuhelnik(double delkaStranAB, double vrcholovyUhelStupne, Color penColor) {
        zofka.setPenColor(penColor);

        double delkaZakladny;
        double prevodStupne;
        prevodStupne = Math.toRadians(vrcholovyUhelStupne);
        delkaZakladny = 2 * delkaStranAB * Math.sin(prevodStupne / 2);

        zofka.move(delkaZakladny);
        zofka.turnRight(180 - (180 - (vrcholovyUhelStupne / 2 + 90)));
        zofka.move(delkaStranAB);
        zofka.turnRight(180 - vrcholovyUhelStupne);
        zofka.move(delkaStranAB);
    }


    //ukol - cast 2

    public void nakresliZmrzlinu(double vrcholovyUhel, double zakladnaAPrumerKruhu, Color penColor) {

        zofka.setPenColor(penColor);

        double delkaStran;
        double prevodStupne;
        prevodStupne = Math.toRadians(vrcholovyUhel);
        delkaStran = zakladnaAPrumerKruhu / (2 * (Math.sin(prevodStupne / 2)));

        zofka.turnLeft(90);
        zofka.move(zakladnaAPrumerKruhu);
        zofka.turnLeft(180 - ((180 - vrcholovyUhel) / 2));
        zofka.move(delkaStran);
        zofka.turnLeft(180 - vrcholovyUhel);
        zofka.move(delkaStran);

        zofka.setPenColor(Color.PINK);
        double obvodKruhu;
        double delkaKroku;

        obvodKruhu = 3.14 * zakladnaAPrumerKruhu;
        delkaKroku = (obvodKruhu / 20) + 2;

        for (int i = 0; i < 18; i++) {
            zofka.turnLeft(20);
            zofka.move(delkaKroku);
        }


    }

    public void nakresliSnehulaka() {
        nakresliKruh(5, 18, 30, Color.CYAN);
        zofka.turnLeft(170);
        nakresliKruh(10, 10, 51, Color.CYAN);
        zofka.turnLeft(150);
        nakresliKruh(5, 18, 30, Color.CYAN);

        zofka.turnLeft(10);
        zofka.penUp();
        zofka.move(64);
        zofka.turnRight(90);
        zofka.move(93);
        zofka.turnRight(180);
        zofka.penDown();

        nakresliKruh(13, 10, 37, Color.CYAN);

        zofka.penUp();
        zofka.turnLeft(100);
        zofka.move(117);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliKruh(7, 10, 36, Color.CYAN);
    }

    public void nakresliVlak() {
        nakresliRovnostrannyTrojuhelnik(100, Color.PINK);

        zofka.turnRight(30);
        zofka.move(9);

        nakresliObdelnik(180, 100, Color.LIGHT_GRAY);


        zofka.penUp();
        zofka.move(180);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.penDown();

        nakresliObdelnik(200, 120, Color.LIGHT_GRAY);
        nakresliKruh(22, 20, 32, Color.PINK);

        zofka.penUp();
        zofka.turnLeft(10);
        zofka.move(90);
        zofka.penDown();

        nakresliKruh(10, 18, 20, Color.PINK);

        zofka.penUp();
        zofka.move(100);
        zofka.penDown();

        nakresliKruh(10, 18, 20, Color.PINK);

    }


}
