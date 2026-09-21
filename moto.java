public class moto {
	private String Marca;
	private int Cc;
	private String Modelo;
	private double Preco;
	

	public void aplicarDesconto(double valorDoDescontoDigitado) {
		this.Preco -= valorDoDescontoDigitado;
	}

	


	public moto(String MarcaDaMoto, int CcDaMoto, String ModeloDaMoto, double precoDaMoto) {
		this.Marca = MarcaDaMoto; 
		this.Cc = CcDaMoto;
		this.Modelo = ModeloDaMoto;
		this.Preco = precoDaMoto;
		
		
		
		
}


	void status() {
		System.out.println(" A marca é " + this.Marca);
        System.out.println("A cilindrada dela é de " + this.Cc);
        System.out.println("O modelo da moto é " + this.Modelo);
        System.out.println("E essa moto fica por apenas " + this.Preco);
	}
	
	}
