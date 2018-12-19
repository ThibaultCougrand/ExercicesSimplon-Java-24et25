package exercices24et25;

public class TP {

	public static void main(String[] args) {
		User user1 = new User();
		
		System.out.println("Voici l'utilisateur "+user1.getId());
		user1.affichage();
		user1 = null;
		System.gc();
	
		System.out.println("====================================");
		
		User user2 = new User(2, "Madame", "BLANCBRUDE", "Lola", "lola@monmail.com", "04 01 01 01 01", "06 03 03 03 03", "LolaBB", "12/01/2012");
		
		System.out.println("Voici l'utilisateur "+user2.getId());
		user2.setPassword(user2.calculPw());
		user2.affichage();
		user2 = null;
		System.gc();
		
		
		
		System.out.println("====================================");
		
		User user3 = new User();
		user3.setId(3);
		user3.setCivilité("Monsieur");
		user3.setNom("COUGRAND");
		user3.setPrenom("Thibault");
		user3.setEmail("thibault@monmail.com");
		user3.setTel("04 01 01 01 01");
		user3.setPortable("06 02 02 02 02");
		user3.setLogin("ThibaulC");
		user3.setPassword(user3.calculPw());
		user3.setDateInscription("12/01/2012");
		
		System.out.println("Voici l'utilisateur "+user3.getId());
		user3.affichage();
		
		System.out.println("====================================");
		
		User user4 = new User(user3);
		user4.affichage();
		
	}

}
