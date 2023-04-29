public class ControleBonificacao {
	
	private double soma;
	
	public void controla(Funcionario f) {
		double conta = f.getBonificacao();
				soma = soma + conta;
	}
	
	public double getSoma() {
		return soma;
	}

}
