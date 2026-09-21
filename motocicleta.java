class sla {
   public static void main(String[] args) {
		moto motocicleta = new moto("Yamaha", 250, "Fazer FZ25", 22000.00);
        motocicleta.aplicarDesconto(1500.00);
		motocicleta.status();
    }
}
