package modelagem_iphone;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ProjetoIphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iphone iphone11 = new Iphone();
		
		
		iphone11.ligar("3215-3760");
		iphone11.atender();
		iphone11.iniciarCorreioVoz();
		
		System.out.println("------------");
		
		
		iphone11.exibirpágina("www.local.com");
		iphone11.adicionarNovaAba();
		iphone11.atulizarPagina();
		
		
		System.out.println("--------------");
		
		
		iphone11.tocar();
		iphone11.pausar();
		iphone11.selecionarMusica("One - Metllica");
		
	}

}
