import java.util.List;

public class Pedido{
	private List<ItemPedido> itensPedido;
	private int tipoFrete;

	public double calcularFrete(){
		double total = 0;
		
		if(tipoFrete == 1){
			//Forma de cálculo da empresa A
			//calcula o valor do frete
			
		} else if(tipoFrete == 2){
			//Forma de cálculo da empresa B
			//calcula o valor do frete
			
		} else if(tipoFrete == 3){
			//Forma de cálculo da empresa C
			//calcula o valor do frete
			
		}
			
		return total;
	}
}
