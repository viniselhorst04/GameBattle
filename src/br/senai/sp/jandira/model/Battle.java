package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Battle {

    String scenarioBattle;

    Scanner scanner = new Scanner(System.in);

    public void startBattle(Player player, Enemy enemy){

        boolean continuar = true;

        while (true){

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();

            if (lifeEnemy <= 0 ){
                System.out.println("\n O player " + player.getName() + " ganhou!!!\n");

                break;

            }else if(lifePlayer <= 0) {
                System.out.println("\n O enemy " + enemy.getName() + " ganhou!!!\n");

                break;

            }


            System.out.println(" | -------------- Battle ------------- | \n");
            System.out.println(" Ataque Player [ V ]" + player.getName() + " Life: " + lifePlayer);
            System.out.println(" Ataque Enemy [ A ]" + enemy.getName() + " Life: " + lifeEnemy);
            System.out.println(" | ---------------------------------- | \n");

            String attack = scanner.nextLine();

            if(attack.equalsIgnoreCase("V")) {

                System.out.println(" | ------------- O Player Atacou ----------- | ");

                int danoPlayer = ((int) (Math.random() * 20) + 1);
                System.out.println(" Ataque de : " + danoPlayer);
                enemy.subtrairVida(danoPlayer);
                System.out.println("\n O inimigo tomou: " + danoPlayer + " de dano!");
                System.out.println(" -----------------------------------------------\n");

            }else if (attack.equalsIgnoreCase("A")){

                System.out.println(" | ------------- O Enemy Atacou ----------- | ");

                int danoEnemy = (int) (Math.random()*20 + 1);
                System.out.println(" Ataque de : " + danoEnemy);
                player.subtrairVida(danoEnemy);
                System.out.println("\n O Player tomou: " + danoEnemy + " de dano!");
                System.out.println(" -----------------------------------------------\n");

            }else {
                System.out.println(" Digite uma tecla válida !");
            }



        }

    }

}
