public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		Gerente g = new Gerente();
		g.setSalario(5000);
		
		
		EditorVideo ed = new EditorVideo();
		ed.setSalario(2500);
		
		Diretor d = new Diretor();
		d.setSalario(7000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.controla(f);
		controle.controla(g);
		controle.controla(ed);
		controle.controla(d);
		
		System.out.println(controle.getSoma());
		System.out.println(Funcionario.getTotal());
	}

}
