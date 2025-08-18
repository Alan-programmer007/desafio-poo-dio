package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	private int cargaHoraria;	

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
	public Curso() {
		
	}
	
	public int getcargaHoraria() {
		return cargaHoraria;
	}
	public void setcargaHoraria(int cargaHoraia) {
		this.cargaHoraria = cargaHoraia;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraia=" + cargaHoraria + "]";
	}

}
