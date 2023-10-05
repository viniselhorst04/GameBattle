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

                DefesaEnemy(danoPlayer,enemy);


                // ---------------------- ATAQUE DO ENEMY --------------------------- //


            }else if (attack.equalsIgnoreCase("A")){

                System.out.println(" | ------------- O Enemy Atacou ----------- | ");

                int danoEnemy = (int) (Math.random()*20 + 1);

                DefesaPlayer(danoEnemy,player);

            }else {
                System.out.println(" Digite uma tecla válida !");
            }

        }

    }

    // --------------------------- METODOS ------------------------------ //

    public void DefesaEnemy(int danoPlayer,Enemy enemy){

        System.out.print("\n Enemy, Acerte o número aleatório de 1 à 2 para gerar uma defesa! ");
        int randomDefesa = ((int) (Math.random()*2) +1);
        int defesaEnemy = ((int) (Math.random()*20) +1);
        int numDefesaEnemy = scanner.nextInt();
        scanner.nextLine();
        if (randomDefesa == numDefesaEnemy){

            System.out.println(" ------------ O Enemy Defendeu! ------------");
            System.out.println(" O Ataque era de: " + danoPlayer);
            System.out.println(" A Defesa foi de: " + defesaEnemy);

            if (defesaEnemy>danoPlayer){
                danoPlayer = 0;
                System.out.println(" A defesa neutralizou todo ataque!");
            }else {
                int danoPlayerDefendido = danoPlayer - defesaEnemy;
                System.out.println(" Ataque de : " + danoPlayerDefendido);
                enemy.subtrairVida(danoPlayerDefendido);
                System.out.println("\n O inimigo tomou: " + danoPlayerDefendido + " de dano!");
                System.out.println(" -----------------------------------------------\n");
            }

        }else {

            System.out.println(" Ataque foi de : " + danoPlayer);
            enemy.subtrairVida(danoPlayer);
            System.out.println("\n O inimigo tomou: " + danoPlayer + " de dano!");
            System.out.println(" -----------------------------------------------\n");

        }
    }


    public void DefesaPlayer(int danoEnemy,Player player){

        System.out.print("\n Player, Acerte o número aleatório de 1 à 2 para gerar uma defesa! ");
        int randomDefesa = ((int) (Math.random()*2) +1);
        int defesaPlayer = ((int) (Math.random()*20) +1);
        int numDefesaPlayer = scanner.nextInt();
        scanner.nextLine();


        if (randomDefesa == numDefesaPlayer){

            System.out.println(" ------------ O Player Defendeu! ------------");
            System.out.println(" O Ataque era de: " + danoEnemy);
            System.out.println(" A Defesa foi de: " + defesaPlayer);

            if (defesaPlayer>danoEnemy){
                danoEnemy = 0;
                System.out.println(" A defesa neutralizou todo ataque!");
            }else {
                int danoPlayerDefendido = danoEnemy - defesaPlayer;
                System.out.println(" Ataque de : " + danoPlayerDefendido);
                player.subtrairVida(danoPlayerDefendido);
                System.out.println("\n O inimigo tomou: " + danoPlayerDefendido + " de dano!");
                System.out.println(" -----------------------------------------------\n");
            }

        }else {

            System.out.println(" Ataque foi de : " + danoEnemy);
            player.subtrairVida(danoEnemy);
            System.out.println("\n O inimigo tomou: " + danoEnemy + " de dano!");
            System.out.println(" -----------------------------------------------\n");

        }

    }

}
