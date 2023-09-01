package demoStatExample;

import java.util.ArrayList;
import java.util.List;

public class CandidatsList {
	public static List<Candidats> listCandidats=new ArrayList<Candidats>();
	
	public void showList()
	{
		for(Candidats c: listCandidats)
		{
			System.out.println("Id= "+Candidats.id);
			System.out.println(c.toString());
		}
	}
	public CandidatsList(List<Candidats> listCandidats) {
		super();
		this.listCandidats = listCandidats;
	}

}
