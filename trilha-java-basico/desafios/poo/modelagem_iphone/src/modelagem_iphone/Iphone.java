package modelagem_iphone;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

	@Override
	public void atender() {
		System.out.println("Atendendo ligação!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
System.out.println("ligando correio de voz!");		
	}

	@Override
	public void ligar(String numero) {
System.out.println("ligando para o número: " + numero);		
	}

	@Override
	public void atulizarPagina() {
System.out.println("Atualizando Página");		
	}

	@Override
	public void adicionarNovaAba() {
		
		System.out.println("Aba Adicionada!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exibirpágina(String url) {
System.out.println("Acessando página " + url);		
	}

	@Override
	public void tocar() {
System.out.println("Tocando musica");		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");	
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Ecolhida musica " + musica);			
	}
	
	
	
	
	

}
