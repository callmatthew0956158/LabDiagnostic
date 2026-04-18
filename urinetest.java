public class urinetest {

    protected String color;
    protected String clarity;
    protected boolean glucose;
    protected boolean protein;
    protected String bacteria; // none, few, many
    protected double ph; // urine pH

    public urinetest(String color, String clarity, boolean glucose, boolean protein,
                     String bacteria, double ph) {

        this.color = color;
        this.clarity = clarity;
        this.glucose = glucose;
        this.protein = protein;
        this.bacteria = bacteria;
        this.ph = ph;
    }
}