package While_ArrayList;

import java.util.ArrayList;

public class ListaNomes {


private ArrayList<String> nomes = new ArrayList<>();	
		
public void adicionarNome(String nome) {		
		nomes.add(nome);
			System.out.println("Adicionado.");
}	
		
public void listarNomes() {
		if(nomes.isEmpty()) {
			System.out.println("lista VAZIA.");		
		
		}else{
			System.out.println("==Nomes Cadastrados==");
				for(String total: nomes) {
					System.out.println(total);

				}			
			}	
		}
	
			public void removerNomes(String nome)	{
				if(nomes.remove(nome)) {
					System.out.println("Nome Removido.");
				}else{
					System.out.println("Não encontrado.");
		
			}
		}
		
			public void buscarNome(String nome) {	
				if(nomes.contains(nome)) {
					int posicao = nomes.indexOf(nome);
						System.out.println("Encontrado na posição");
				}else{
						System.out.println("nome não encontrado.");			}
			
			}
		}	