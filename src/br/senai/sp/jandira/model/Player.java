package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Player {

    private String name, skin;
    private int life = 100;

    Scanner scanner = new Scanner(System.in);

    public void subtrairVida(int danoEnemy) {
        this.life -= danoEnemy;

        if (this.life < 0) {
            this.life = 0;
        }
    }

    public void cadastrarPlayer(){

        System.out.println("\n |------------ Cadastro Player -----------| \n");
        System.out.print("\n Informe o nome do player: ");
        name = scanner.nextLine();
        System.out.print("\n Informe a skin do player: ");
        skin = scanner.nextLine();
        System.out.println("\n |----------------------------------------| \n");


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
