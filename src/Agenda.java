import java.util.ArrayList;

public class Agenda {
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public ArrayList<Pessoa> getContatos() {
		return pessoas;
	}

	public void setContatos(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public void add(Pessoa pessoaAdd) {
		if (!pessoas.contains(pessoaAdd))
			pessoas.add(pessoaAdd);
	}
	
	public void update(Pessoa pessoaUpdate) {
		for (Pessoa pessoa : pessoas) {
			if(pessoa.equals(pessoaUpdate)) {
				pessoa = pessoaUpdate;
			}
		}
	}
	
	public void remove(Pessoa pessoaDelete) {
		pessoas.remove(pessoaDelete);
	}
	
	public ArrayList<Pessoa> whereNameLike(String busca){
		ArrayList<Pessoa> buscaPessoas = new ArrayList<Pessoa>();
		pessoas.forEach((pessoa) -> {
			if(pessoa.nome.contains(busca))
				buscaPessoas.add(pessoa);
		});
		
		return buscaPessoas;
	}
	
	public ArrayList<Pessoa> whereDomainLike(String busca){
		ArrayList<Pessoa> buscaPessoas = new ArrayList<Pessoa>();
		pessoas.forEach((pessoa) -> {
			if(pessoa.email.GetDomain().contains(busca))
				buscaPessoas.add(pessoa);
		});
		
		return buscaPessoas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Agenda [pessoas=");
		builder.append(pessoas);
		builder.append("]");
		return builder.toString();
	}

}
