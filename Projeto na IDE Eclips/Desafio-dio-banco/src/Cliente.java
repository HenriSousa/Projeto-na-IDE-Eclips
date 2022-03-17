

public class Cliente extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Cliente");
		imprimirInfo();	
				
	}
}