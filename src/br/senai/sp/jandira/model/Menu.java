package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Player player = new Player();
    Enemy enemy = new Enemy();
    Battle battle = new Battle();
    Scenario scenario = new Scenario();
    Output output = new Output();

    public void executarMenu(){

        boolean continuar = true;

        while (continuar) {

            System.out.println("\n | ---------------- Menu ---------------- |\n");
            System.out.println(" 1 - Cadastrar Player                    ");
            System.out.println(" 2 - Cadastrar Enemy                     ");
            System.out.println(" 3 - Battle                              ");
            System.out.println(" 4 - Sair                                ");
            System.out.println("\n | -------------------------------------- |");

            System.out.print(" Escolha uma opção:");
            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser){

                case 1:
                    player.cadastrarPlayer();
                    System.out.println(" \nCadastrando ....");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    output.exibirPlayer(player);
                    break;

                case 2:
                    enemy.cadastrarEnemy();
                    System.out.println(" \nCadastrando ....");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    output.exibirEnemy(enemy);
                    break;

                case 3:

                    battle.scenarioBattle = scenario.selecionarScenario();
                    battle.startBattle(player, enemy);
                    player.setLife(100);
                    enemy.setLife(100);

                    break;

                case 4:
                    System.out.println(" Saindo ....");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continuar = false;
                    break;
            }

        }

    }


}
