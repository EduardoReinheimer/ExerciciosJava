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
		
		
		System.out.println(ag);
		
	}

}
