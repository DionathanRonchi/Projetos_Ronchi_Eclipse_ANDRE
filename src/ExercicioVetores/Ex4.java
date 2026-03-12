package ExercicioVetores;

public class Ex4 {
/*4) Considerando um vetor com 6 números pré-definidos, percorra seus elementos, calcule a
soma apenas dos números pares e apresente o resultado final.*/
	
	public static void main(String[] args) {
		int[] numeros = {3, 8, 10, 15, 20};
			int soma=0;
	
	for(int i=0; i<numeros.length; i++) {
		if(numeros[i] % 2 ==0) {
			soma += numeros[i];
		}
	}
	System.out.println("Soma dos pares: " + soma);
	
	}
}