package br.edu.SistemaDeEventos.validador;

import org.junit.Before;
import org.junit.Test;

import br.edu.SistemaDeEventos.excecao.ValidacaoCampoObrigatorioExcecao;
import br.edu.SistemaDeEventos.excecao.ValidacaoRegraExcecao;
//import org.junit.Assert.assertEquals;
import br.edu.SistemaDeEventos.modelo.Evento;

public class EventoValidadorTeste {
	
	private EventoValidador eventoValidador;
		
	@Before
	public void setUp() throws Exception {
		eventoValidador = new EventoValidador();
	}
		
	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoSeNomeMaiorPermitido() {		
		Evento evento = new Evento();			
		evento.setNome("Lorem Ipsum � simplesmente uma simula��o de texto da ind�stria tipogr�fica e de impressos, e vem sendo utilizado desde o s�culo XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu n�o s� a cinco s�culos, como tamb�m ao salto para a editora��o eletr�nica, permanecendo essencialmente inalterado. Se popularizou na d�cada de 60, quando a Letraset lan�ou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editora��o eletr�nica como Aldus PageMaker.");
		eventoValidador.validarNumeroCaracteresNome(evento);
	}		
	
	@Test(expected = ValidacaoCampoObrigatorioExcecao.class)
	public void deveLancarExcecaoCampoNomeObrigatorio() {
		Evento evento = new Evento();		
		eventoValidador.validarNomeObrigatorio(evento);
	}
	
	@Test(expected = ValidacaoCampoObrigatorioExcecao.class)
	public void deveLancarExcecaoDataHoraEventoMenorAgora() {
		Evento evento = new Evento();		
		eventoValidador.validarDataHoraEventoMenorQueAgora(evento);
	}
	
	@Test(expected = ValidacaoCampoObrigatorioExcecao.class)
	public void deveLancarExcecaoDataHoraInicialVendaIngressoEventoMaiorEvento() {
		Evento evento = new Evento();		
		eventoValidador.validarDataHoraInicialVendaIngressoEventoMaiorEvento(evento);
	}
	
	@Test(expected = ValidacaoCampoObrigatorioExcecao.class)
	public void deveLancarExcecaoDataHoraFinalVendaIngressoEventoMaiorEvento() {
		Evento evento = new Evento();		
		eventoValidador.validarDataHoraFinalVendaIngressoEventoMaiorEvento(evento);
	}
		
}
