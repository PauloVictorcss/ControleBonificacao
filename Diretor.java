public class Diretor extends Funcionario{
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
		
	}

}
