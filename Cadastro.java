package PI;

public class Cadastro {
	// Atributos --> variaveis
		private String nome; // chama me pelo nome
		private String identiGenero; // idenfica com TRans,cis,nao binario e etc 5
		private String OrientSexo; // Orientação sexual declarada.
		private String etnia; // Qual etnia a pessoa declara.
		private double renda; // <=1212,00 = 10% | >1212,00 = 5%

		// Métodos de ação --> getters and setters

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getIdentiGenero() {
			return identiGenero;
		}
		public void setIdentiGenero(String identiGenero) {
			this.identiGenero = identiGenero;
		}
		public String getOrientSexo() {
			return OrientSexo;
		}
		public void setOrientSexo(String orientSexo) {
			OrientSexo = orientSexo;
		}
		public String getEtnia() {
			return etnia;
		}
		public void setEtnia(String etnia) {
			this.etnia = etnia;
		}
		public double getRenda() {
			return renda;
		}
		public void setRenda(double renda) {
			this.renda = renda;
		}
		// void nome() {
		// System.out.println("Digite o seu nome: " + nome);
}
