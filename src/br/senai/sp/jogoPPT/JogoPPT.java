package br.senai.sp.jogoPPT;

/**
 * Pedra, Papel e Tesoura
 * Data: 17/08/2023
 * Autor: Guilherme Pereira
 * */

import java.util.Random;
import java.util.Scanner;

public class JogoPPT {
    public static void main(String[] args) {

        /** Cria variaveis */
        String usuario = "";
        int maquina, number;
        String pedra = "PEDRA";
        String papel = "PAPEL";
        String tesoura = "TESOURA";
        String escolha = "";
        boolean continuar = true;

        /** Instancia Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instancia Random */
        Random aleatorio = new Random();

        while (continuar) {

            /** Coletar Dados do Usuario */
            System.out.println("----------------------------------------------");
            System.out.println("----------> PEDRA, PAPEL OU TESOURA <---------");
            System.out.println("Escolha uma opção:\n1 - PEDRA 🌑\n2 - PAPEL 📃\n3 - TESOURA ✂");
            System.out.print("Digite aqui: ");
            number = teclado.nextInt();
            System.out.println("----------------------------------------------");

            /** Gera um número aleatório entre 1 e 3 */
            maquina = aleatorio.nextInt(3)+1;

            /** Relaciona o valor int com o valor string - em relacao a escolha*/
            switch (number) {
                case 1:
                    usuario = pedra;
                    break;
                case 2:
                    usuario = papel;
                    break;
                case 3:
                    usuario = tesoura;
                    break;
            }

            switch (maquina) {
                case 1:
                    escolha = pedra;
                    break;
                case 2:
                    escolha = papel;
                    break;
                case 3:
                    escolha = tesoura;
                    break;
            }

            /** Exibe a compatibilidade do resultado */
            System.out.println("Você escolheu "+ usuario + " e o computador "+ escolha);

            if (maquina==number) {
                System.out.println(">>>>>>>>>>>>>> Você empatou!!!!");
            }
            if (maquina==1&&number==3 || maquina==2&&number==1 || maquina==3&&number==2){
                System.out.println(">>>>>>>>>>>>>> Você perdeu!!!!!");
            }
            if (maquina==1&&number==2 || maquina==2&&number==3 || maquina==3&&number==1){
                System.out.println(">>>>>>>>>>>>>> Você ganhou!!!!!");
                continuar = false;

            }
        }
    }
}
