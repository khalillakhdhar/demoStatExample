package demoStatExample;

import java.util.ArrayList;
import java.util.List;

public class CandidatsList {
	public static List<Candidats> listCandidats=new ArrayList<Candidats>();
	
	public static void showList()
	{
		int id=0;
		for(Candidats c: listCandidats)
		{
			id++;
			System.out.println("Id= "+id);
			System.out.println(c.toString());
		}
	}
	public CandidatsList(List<Candidats> listCandidats) {
		super();
		this.listCandidats = listCandidats;
	}

}
