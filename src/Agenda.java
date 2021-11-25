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
	
	public void delete(Pessoa pessoaDelete) {
		pessoas.remove(pessoaDelete);
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
