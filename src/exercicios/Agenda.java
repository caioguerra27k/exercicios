package exercicios;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class Agenda {

	protected String event;
	protected SimpleDateFormat dateBegin;
	protected SimpleDateFormat dateEnd;
	protected List<Pessoa> pessoas;

	public List<Pessoa> getPessoas() {
		return this.pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Agenda() {

	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public SimpleDateFormat getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(SimpleDateFormat d) {
		this.dateBegin = d;
	}

	public SimpleDateFormat getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(SimpleDateFormat d) {
		this.dateEnd =d;
	}

	void imprimeAgenda() {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		listaPessoas = this.getPessoas();
		for (Pessoa pessoaAtual : listaPessoas);			
			}

	void adicionaPessoa(String nome, int idade, double altura) {
		List<Pessoa> novaLista = (this.pessoas == null)? new ArrayList<Pessoa>():this.pessoas;
		if (this.pessoas == null) {
			this.pessoas = new ArrayList<Pessoa>();
		}
		//novaLista = this.pessoas;
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome(nome);
		novaPessoa.setIdade(idade);
		novaPessoa.setAltura(altura);
		novaLista.add(novaPessoa);
		setPessoas(novaLista);
	}

	void removePessoa(String nome) {
		List<Pessoa> novaLista = (this.pessoas == null)? new ArrayList<Pessoa>():this.pessoas;
		for (Pessoa pessoaAtual : novaLista) {
			if (pessoaAtual.getNome().equals(nome)) {
				novaLista.remove(pessoaAtual);
			}
		}
	}

	void imprimePessoa(int idade) {
		List<Pessoa> novaLista = (this.pessoas == null)? new ArrayList<Pessoa>():this.pessoas;;
		for(int i = 0; i < novaLista.size(); i++) {
			pessoas.get(i);
			System.out.println(novaLista.get(i));
		}
	}

	void buscaPessoa(String nome) {
		List<Pessoa> novaLista = (this.pessoas == null)? new ArrayList<Pessoa>():this.pessoas;;
		pessoas = getPessoas();
		for (Pessoa pessoaAtual : novaLista) {
			if (pessoaAtual.getNome().equals(nome)) {
				System.out.println(pessoaAtual);
			}
		} 
	}

	@Override
	public String toString() {
		return "Agenda [pessoas=" + pessoas + ", getPessoas()=" + getPessoas() + "]";
	}
}