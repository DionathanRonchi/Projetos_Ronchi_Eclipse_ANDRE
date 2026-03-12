package ExercicioVetores;

public class Ex1 {
/*1) Utilizando um vetor com 5 números inteiros 
* pré-definidos, exiba todos os seus valores e
calcule mostrando a soma total dos elementos.*/

public static void main(String[] args) {
	int soma=0;
		int [] numeros = {30, 18, 10, 5, 60, 20, 45};
		for(int i=0; i < numeros.length; i++) {
			
	System.out.println("Na posição ["+ i + "] = "+numeros[i]);
	soma += numeros[i];
		}
	
	System.out.println("Soma total: " + soma);
	
	}
}