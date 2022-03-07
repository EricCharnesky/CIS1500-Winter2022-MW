package chapter7.classes;

public class Tree {
    // No main method, this doesn't run

    // list of attributes first - instance attributes
    // each Tree gets it's own set of attributes in memory
    private String species;
    private double heightInMeters;
    private String barkColor;
    
    public void chopDown(){
        heightInMeters = 0;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        // this. means the instance attribute
        this.species = species;
    }

    public double getHeightInMeters() {
        return heightInMeters;
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
