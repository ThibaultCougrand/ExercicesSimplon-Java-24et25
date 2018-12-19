package exercices24et25;

public class User {
	private int id ;
	private String civilité, nom, prenom, email, tel, portable, login, password, dateInscription ;
	int nbUser = 0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCivilité() {
		return civilité;
	}
	public void setCivilité(String civilité) {
		this.civilité = civilité;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPortable() {
		return portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(String dateInscription) {
		this.dateInscription = dateInscription;
	}
	
	public String calculPw() {
		return this.getNom().toLowerCase()+"pw";
	}
	public void affichage() {
		System.out.println(getCivilité()+" "+getNom()+" "+getPrenom()+"\n"+getEmail()+"\n"+getTel()+"\n"+getPortable()+"\n"+getLogin()+" "+getPassword()+"\n"+getDateInscription());
	}
	public void finalize() {
		System.out.println("Objet détruit!");
	}
	public User() {
		
	}
	public User(int id, String civilité, String nom, String prenom, String email, String tel, String portable, String login, String dateInscription) {
		this.setId(id);
		this.setCivilité(civilité);
		this.setNom(prenom);
		this.setPrenom(prenom);
		this.setEmail(email);
		this.setTel(tel);
		this.setPortable(portable);
		this.setLogin(login);
		this.setDateInscription(dateInscription);
		
	}
	public User(User otherUser) {
		this.id = otherUser.id;
		this.civilité = otherUser.civilité;
		this.nom = otherUser.nom;
		this.prenom = otherUser.prenom;
		this.email = otherUser.email;
		this.tel = otherUser.tel;
		this.portable = otherUser.portable;
		this.login = otherUser.login;
		this.password = otherUser.password;
		this.dateInscription = otherUser.dateInscription;
	}
}
