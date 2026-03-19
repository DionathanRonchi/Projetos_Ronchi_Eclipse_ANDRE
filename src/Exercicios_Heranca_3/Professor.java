package Exercicios_Heranca_3;

public class Professor extends Pessoa{

private String disciplina;
private double salario;
public Professor(String nome, int cpf, int idade, String disciplina, double salario) {
	super(nome, cpf, idade);
	this.disciplina = disciplina;
	this.salario = salario;
}
public String getDisciplina() {
	return disciplina;
}
public void setDisciplina(String disciplina) {
	this.disciplina = disciplina;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}

@Override public void exibirDados() {
super.exibirDados();
System.out.println("Disciplina: " + disciplina);
System.out.println("Salario: " + salario);

		}
	}