package demoStatExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidats c1=new Candidats("Bouguerra", "Narjes", "20999333");
CandidatsList.listCandidats.add(c1);
Candidats c2=new Candidats("Mansouri", "Chaima", "20999111");
// aucun besoin d'instance
CandidatsList.listCandidats.add(c2);
CandidatsList.showList();
//CandidatsList cl1=new CandidatsList(null);
//cl1.showList();
		/*System.out.println("candidat numéro "+Candidats.id);

		System.out.println(c1.toString());

		System.out.println("candidat numéro "+Candidats.id);
		System.out.println(c2.toString());
		*/

	}

}
