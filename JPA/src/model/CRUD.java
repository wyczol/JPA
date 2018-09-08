package model;

public class CRUD {

	public static void main(String[] args) {

		PracownicyCRUD pracownicyCRUD = new PracownicyCRUD();
		
		Pracownicy pracownicy = new Pracownicy();

		pracownicyCRUD.createPracownicy(prac);
		pracownicyCRUD.readPracownicy(nr);
		pracownicyCRUD.updateSalary(nr);
		pracownicyCRUD.deletePracownicy(nr);
	}

}
