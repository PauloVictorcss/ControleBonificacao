public class Funcionario {
	
	private String nome;
	private String CPF; 
	private double salario;
	private static int total;
	
	public Funcionario() {
		Funcionario.total++;
		
	}
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public static int getTotal() {
		return Funcionario.total;
	}
	
	

}
