package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Faça uma boa viajem!");
		Comment c2 = new Comment("uau, isso é incrivel!!");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:11"), "Assis", "Uma cidade bonita", 500);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		

	}

}
