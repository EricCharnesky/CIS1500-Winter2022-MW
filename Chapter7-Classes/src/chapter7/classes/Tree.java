package chapter7.classes;

public class Tree {
    // No main method, this doesn't run

    // list of attributes first - instance attributes
    // each Tree gets it's own set of attributes in memory
    private String species;
    private double heightInMeters;
    private String barkColor;
    
    
    // constructor method - it's job is to create an instance of the class
    // give values to all of the attributes
    // no return type, name matches the class name
    
    // can't use a default constuctor if we have attributes with no set* methods
//    public Tree(){
//        species = "";
//        barkColor = "";
//        heightInMeters = 0;
//    }
    
    // parameterized constructor
    public Tree(String species, String barkColor, double heightInMeters){
        this.species = species;
        this.barkColor = barkColor;
        //this.heightInMeters = heightInMeters;
        // use the method that checks for valid values
        setHeightInMeters(heightInMeters);
    }
    
    public void chopDown(){
        heightInMeters = 0;
    }

    public String getSpecies() {
        return species;
    }

    // we don't want this, a tree species never changes
//    public void setSpecies(String species) {
//        // this. means the instance attribute
//        this.species = species;
//    }

    public double getHeightInMeters() {
        return heightInMeters;
    }
    
    // overloaded method, same name, different parameters
    public void setHeightInMeters(String heightInMeters){
        double height = Double.parseDouble(heightInMeters);
        setHeightInMeters(height);
    }

    public void setHeightInMeters(double heightInMeters) {
        // can't have validation loops because there is no prompt        

        // ensures height is valid
        if (heightInMeters > 0) {
            this.heightInMeters = heightInMeters;
        } else {
            this.heightInMeters = 0;
        }
    }

    public String getBarkColor() {
        return barkColor;
    }

    public void setBarkColor(String barkColor) {
        this.barkColor = barkColor;
    }

}
