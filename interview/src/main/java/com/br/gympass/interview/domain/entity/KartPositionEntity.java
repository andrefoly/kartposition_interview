/**
 * KartPositionEntity
 * Creation Date :: 23/05/2019
 * Author: Alcides Foly
 * Description: Domain data class for kart position project. Responsible to map log file fields
 */

package com.br.gympass.interview.domain.entity;

public class KartPositionEntity  implements Comparable<KartPositionEntity>{

	private int lineid;
	private String hora;
	private String piloto;
	private String codpiloto;
	private int numerovolta;
	private String tempovolta;
	private int tempovoltafilter;
	private String velocidademedia;
	private int posicao;
	private String tempototal;

	public int getLineid() {
		return lineid;
	}

	public void setLineid(int lineid) {
		this.lineid = lineid;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCodpiloto() {
		return codpiloto;
	}

	public void setCodpiloto(String codpiloto) {
		this.codpiloto = codpiloto;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public int getNumerovolta() {
		return numerovolta;
	}

	public void setNumerovolta(int numerovolta) {
		this.numerovolta = numerovolta;
	}

	public String getTempoVolta() {
		return tempovolta;
	}

	public void setTempoVolta(String tempovolta) {
		this.tempovolta = tempovolta;
	}
	
	public int getTempovoltafilter() {
		return tempovoltafilter;
	}

	public void setTempovoltafilter(int tempovoltafilter) {
		this.tempovoltafilter = tempovoltafilter;
	}

	public String getVelocidademedia() {
		return velocidademedia;
	}

	public void setVelocidademedia(String velocidademedia) {
		this.velocidademedia = velocidademedia;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public String getTempototal() {
		return tempototal;
	}

	public void setTempototal(String tempototal) {
		this.tempototal = tempototal;
	}

	@Override
	public int compareTo(KartPositionEntity o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
