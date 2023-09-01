package demoStatExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidats c1=new Candidats("Bouguerra", "Narjes", "20999333");
		System.out.println("candidat numéro "+Candidats.id);

		System.out.println(c1.toString());
		Candidats c2=new Candidats("Mansouri", "Chaima", "20999111");

		System.out.println("candidat numéro "+Candidats.id);
		System.out.println(c2.toString());
		

	}

}
