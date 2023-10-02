package br.senai.sp.jandira.model;

public class Output {

    public void exibirPlayer(Player player){

        System.out.println(" | -------------- Exibir Informações -------------- | ");
        System.out.println(" O nome do player é: " + player.getName());
        System.out.println(" A skin do player é: " + player.getSkin());
        System.out.println(" A vida inicial do player é: " + player.getLife());
        System.out.println(" | ------------------------------------------------ | ");

    }

    public void exibirEnemy(Enemy enemy){

        System.out.println(" | -------------- Exibir Informações -------------- | ");
        System.out.println(" O nome do enemy é: " + enemy.getName());
        System.out.println(" A skin do enemy é: " + enemy.getSkin());
        System.out.println(" A vida inicial do enemy é: " + enemy.getLife());
        System.out.println(" | ------------------------------------------------ | ");

    }

}
