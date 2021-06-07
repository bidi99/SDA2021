package pb;

public class StudentDetails {

    private String Nume;
    private String Prenume;
    private double Matematica;
    private double Romana;

    public StudentDetails(String Nume, String Prenume, double Matematica, double Romana) {
        this.Nume = Nume;
        this.Prenume = Prenume;
        this.Matematica = Matematica;
        this.Romana = Romana;
    }

  
    public String getNume() {
		return Nume;
	}


	public void setNume(String nume) {
		Nume = nume;
	}


	public String getPrenume() {
		return Prenume;
	}


	public void setPrenume(String prenume) {
		Prenume = prenume;
	}


	public double getMatematica() {
		return Matematica;
	}


	public void setMatematica(double matematica) {
		Matematica = matematica;
	}


	public double getRomana() {
		return Romana;
	}


	public void setRomana(double romana) {
		Romana = romana;
	}


	@Override
    public String toString() {
        return "Numele : " + Nume + "\n" + "Prenume : " + Prenume + "\n" +
                "Nota matematica : " + Matematica + "\n" + "Nota limba romana: " + Romana + "\n";
    }

}