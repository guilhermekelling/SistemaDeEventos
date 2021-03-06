package br.edu.SistemaDeEventos.servico;

import java.util.Date;

import br.edu.SistemaDeEventos.modelo.Evento;

public class EventoServico {

	public void cadastrarEvento(Evento objEventoDTO) throws Exception {
	
		if(!validarNome(objEventoDTO)) {
			throw new Exception("O nome permite no m�ximo 150 caracteres");
		}
		
		if(!validarData(objEventoDTO)) {
			throw new Exception("A data do evento deve ser igual ou maior que a de hoje");
		}		
		
	}
		
	public boolean validarNome(Evento objEventoDTO) {		
		return objEventoDTO.getNome().length() <= 150;
	}
	
	public boolean validarData(Evento objEventoDTO) {		
		Date objDataAtual = new Date();
		
		
		System.out.println(objEventoDTO.getDataHoraEvento().toString());
		System.out.println(objDataAtual.toString());
		
		return objEventoDTO.getDataHoraEvento().after(objDataAtual) ||  objEventoDTO.getDataHoraEvento().equals(objDataAtual);
	}	
	
}
