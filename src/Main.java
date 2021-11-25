import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		Agenda ag = new Agenda();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 15);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.YEAR, 1999);
		
		//Criamos duas pessoas com o mesmo nome 
		Pessoa p1 = new Pessoa(0, "Eduardo", "edu@ardo.com", "88899-9998", cal);
		Pessoa p2 = new Pessoa(1, "Eduardo", "out@ro.com", "88899-9998", cal);
		
		
		//Adicionamos as duas, só uma é adicionada por causa do nome
		ag.add(p1);
		ag.add(p2);
		
		//Ateramos o id e e-mail da pessoa
		p1.setId(2);
		p1.setEmail(new Email("outro@email.com"));
		
		//Testamos Update da Agenda
		ag.update(p1);
		
		//Criamos uma nova pessoa e adicionamos
		p2 = new Pessoa(8, "Frederico", "out@ro.com", "88899-9998", cal);
		ag.add(p2);
		
		//Deletamos o primeiro
		ag.remove(p1);
		
		//E o adicionamos de novo
		ag.add(p1);
		
		//Agora criamos nomes parecidos com Eduardo e uns que não e vamos adicionando a lista. 
		ag.add(new Pessoa(3, "Eder", "edu@ardo.com", "88899-9998", cal));
		ag.add(new Pessoa(4, "Ederson", "edu@ardo.com", "88899-9998", cal));
		ag.add(new Pessoa(5, "Edilson", "edu@ardo.com", "88899-9998", cal));
		ag.add(new Pessoa(6, "Rafael", "edu@ardo.com", "88899-9998", cal));
		
		//Printa lista
		System.out.println(ag);
		
		//Teste where name like 
		System.out.println(ag.whereNameLike("Ed"));
		
		//Teste
		System.out.println(ag.whereDomainLike("ro"));
		
	}

}
