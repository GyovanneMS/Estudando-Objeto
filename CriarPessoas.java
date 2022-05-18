
public class CriarPessoas {

	public static void main(String[] args) {
		JavaProject pessoa1 = new JavaProject();
		JavaProject Pessoa2 = new JavaProject();
		
		pessoa1.nome = "Mirabel Madrigal";
		pessoa1.altura = 1.72;
		pessoa1.peso = 54.32;
		
		pessoa1.andar();
		pessoa1.exibirAtributos();
	}
}
