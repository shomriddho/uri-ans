package Iniciante;

/*

 QUEST�O
 A f�rmula para calcular a �rea de uma circunfer�ncia �: area = pi . raio2. 
 Considerando para este problema que pi = 3.14159:

 - Efetue o c�lculo da �rea, elevando o valor de raio ao quadrado e multiplicando por pi.

 ENTRADA
 A entrada cont�m um valor de ponto flutuante (dupla precis�o), no caso, a vari�vel raio.

 SA�DA
 Apresentar a mensagem "A=" seguido pelo valor da vari�vel area, conforme 
 exemplo abaixo, com 4 casas ap�s o ponto decimal. Utilize vari�veis de 
 dupla precis�o (double). Como todos os problemas, n�o esque�a de imprimir 
 o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1002 {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double raio = leitor.nextDouble();
		double area = 3.14159 * (raio * raio);
		System.out.println(String.format("A=%.4f", area)); 
	}
	
}