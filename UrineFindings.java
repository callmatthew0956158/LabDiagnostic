public class UrineFindings extends urinetest {

    public UrineFindings(String color, String clarity, boolean glucose, boolean protein,
                         String bacteria, double ph) {
        super(color, clarity, glucose, protein, bacteria, ph);
    }

    public void showUrineResults() {

        System.out.println("\n===== URINALYSIS =====");
        System.out.println("Color     : " + color);
        System.out.println("Clarity   : " + clarity);
        System.out.println("Glucose   : " + (glucose ? "Present" : "Normal"));
        System.out.println("Protein   : " + (protein ? "Present" : "Normal"));
        System.out.println("Bacteria  : " + bacteria);
        System.out.println("pH Level  : " + ph);

        System.out.println("\n===== INTERPRETATION =====");

        if (glucose) {
            System.out.println("- Possible Diabetes");
        }

        if (protein) {
            System.out.println("- Possible Kidney Problem");
        }

        if (bacteria.equalsIgnoreCase("many")) {
            System.out.println("- Possible Urinary Tract Infection (UTI)");
        } else if (bacteria.equalsIgnoreCase("few")) {
            System.out.println("- Mild Bacterial Presence");
        }

        if (ph < 4.5) {
            System.out.println("- Very Acidic (Possible Metabolic Issue)");
        } else if (ph <= 6.0) {
            System.out.println("- Acidic Urine");
        } else if (ph <= 7.5) {
            System.out.println("- Normal pH");
        } else {
            System.out.println("- Alkaline Urine (Possible Infection)");
        }

        if (!glucose && !protein && bacteria.equalsIgnoreCase("none") && (ph >= 6.0 && ph <= 7.5)) {
            System.out.println("Normal Urine Result");
        }
    }
}