
public class Paciente {

	private String nome;
	private int idade;
	private boolean prioridade;
	
public Paciente(String nome, int idade, boolean prioridade) {
	this.nome = nome;
	this.idade = idade;
	this.prioridade = prioridade;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public boolean isPrioridade() {
	return prioridade;
}

public void setPrioridade(boolean prioridade) {
	this.prioridade = prioridade;
}


@Override
public String toString() {
    return "Paciente: " + nome  +
           ", Idade: " + idade +
           ", Prioridade: " + (prioridade ? "Sim" : "Não");
}
}
