
public class Monkey extends RescueAnimal {

    // Instance variable
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    // Constructor
    public Monkey(String name, String gender, String age, String weight, String acquisitionDate,
			String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
			String species, String tailLength2, String height2, String bodyLength2) {
    	
    	setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    	setTailLength(tailLength2);
        setHeight(height2);
        setBodyLength(bodyLength2);
        setSpecies(species);
	}

	public Monkey(String name, String gender, int age, double weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry, String species2, double tailLength2,
			double height2, double bodyLength2) {
		// TODO Auto-generated constructor stub
	}

	public Monkey(String name, String gender, String age, String weight, String acquisitionDate,
			String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
			String species2, double tailLength2, double height2, double bodyLength2) {
		// TODO Auto-generated constructor stub
	}

	public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBodyLength() {
        return bodyLength;
    }
    
    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }
   
}
