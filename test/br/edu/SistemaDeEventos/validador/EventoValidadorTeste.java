package br.edu.SistemaDeEventos.validador;


import org.junit.Before;
import org.junit.Test;

import br.edu.SistemaDeEventos.dto.Evento;
import br.edu.SistemaDeEventos.exception.ValidacaoCampoObrigatorioException;
//import org.junit.Assert.assertEquals;
import br.edu.SistemaDeEventos.exception.ValidacaoRegraException;


public class EventoValidadorTeste {
	
	private EventoValidador eventoValidador;
		
	@Before
	public void setUp() throws Exception {
		eventoValidador = new EventoValidador();
	}
		
	@Test(expected = ValidacaoRegraException.class)
	public void deveLancarExcecaoSeNomeMaiorPermitido() {		
		Evento evento = new Evento();			
		evento.setNome("Lorem Ipsum � simplesmente uma simula��o de texto da ind�stria tipogr�fica e de impressos, e vem sendo utilizado desde o s�culo XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu n�o s� a cinco s�culos, como tamb�m ao salto para a editora��o eletr�nica, permanecendo essencialmente inalterado. Se popularizou na d�cada de 60, quando a Letraset lan�ou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editora��o eletr�nica como Aldus PageMaker.");
		eventoValidador.validarNumeroCaracteresNome(evento);
	}		
	
	@Test(expected = ValidacaoCampoObrigatorioException.class)
	public void deveLancarExcecaoCampoNomeObrigatorio() {
		Evento evento = new Evento();		
		eventoValidador.validarNomeObrigatorio(evento);
	}
	
	
}
