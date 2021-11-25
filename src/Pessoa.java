import java.sql.Date;
import java.util.Calendar;

public class Pessoa {
	int id;
	String nome;
	Email email;
	String telefone;
	Calendar dataNasc;

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		if (dataNasc != null)
			this.dataNasc = dataNasc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id >= 0)
			this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null)
			this.nome = nome;
	}

	public Pessoa(int id, String nome, String email, String telefone, Calendar dataNasc) {
		setId(id);
		setNome(nome);
		this.email = new Email(email);
		setTelefone(telefone);
		setDataNasc(dataNasc);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append(", dataNasc=");
		builder.append(dataNasc.getTime());
		builder.append("]");
		return builder.toString();
	}



}
