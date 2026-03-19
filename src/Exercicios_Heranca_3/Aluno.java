package Exercicios_Heranca_3;

public class Aluno extends Pessoa{

private String curso;
private String matricula;

public Aluno(String nome, int cpf, int idade, String curso, String matricula) {
	super(nome, cpf, idade);
	this.curso = curso;
	this.matricula = matricula;
}

public String getCurso() {
	return curso;
}

public void setCurso(String curso) {
	this.curso = curso;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

@Override public void exibirDados() {
super.exibirDados();
System.out.println("Curso: " + curso);
System.out.println("Matricula: " + matricula);

	}
}