package br.com.alura.forum.config.validacao;

public class ErroNegocioException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	  public String getMessage(){
	    return "{Objeto não existente}";
	  }

}
