package Iniciante;

/*
 
 QUEST�O
 Leia 2 valores inteiros e armazene-os nas vari�veis A e B.
 Efetue a soma de A e B atribuindo o seu resultado na vari�vel X. 
 Imprima X conforme exemplo apresentado abaixo. N�o apresente 
 mensagem alguma al�m daquilo que est� sendo especificado.

 ENTRADA
 A entrada cont�m 2 valores inteiros.
 
 SA�DA
 Imprima a mensagem "X = " (letra X mai�scula) seguido pelo valor 
 da vari�vel X e pelo final de linha. Cuide para que tenha um espa�o 
 antes e depois do sinal de igualdade, conforme o exemplo abaixo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1001 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int x = a + b;
        System.out.println("X = " + x);
    }
	
}