public class StoolFindings extends Stooltest {

    public StoolFindings(String color, String consistency,
                         String blood, String mucus,
                         String parasites, String bacteria) {

        super(color, consistency, blood, mucus, parasites, bacteria);
    }

    public void showStoolResults() {

        System.out.println("\n===== STOOL TEST RESULTS =====");

        System.out.println("--- Gross ---");
        System.out.println("Color        : " + color);
        System.out.println("Consistency  : " + consistency);

        System.out.println("--- Microscopic Findings ---");
        System.out.println("Bacteria     : " + bacteria);
        System.out.println("Parasites    : " + parasites);
        System.out.println("Blood        : " + blood);
        System.out.println("Mucus        : " + mucus);

        System.out.println("\n===== FINDINGS =====");

        String bloodN = blood.trim().toLowerCase();
        String mucusN = mucus.trim().toLowerCase();
        String bacteriaN = bacteria.trim().toLowerCase();
        String parasiteN = parasites.trim().toLowerCase();

        // BLOOD
        if (bloodN.contains("positive")) {
            System.out.println("- Possible intestinal bleeding");
        }

        // MUCUS
        if (mucusN.contains("positive")) {
            System.out.println("- Possible infection or inflammation");
        }

        // BACTERIA
        if (bacteriaN.contains("positive")) {
            System.out.println("- Bacterial infection detected");
        } else if (bacteriaN.contains("negative")) {
            System.out.println("- No bacterial infection detected");
        }

        // PARASITES
        if (parasiteN.equals("none")) {
            System.out.println("- No parasites detected");
        } 
        else if (parasiteN.equals("few")) {
            System.out.println("- Parasitic presence detected");
            System.out.println("  Severity: Mild infestation");
        } 
        else if (parasiteN.equals("moderate")) {
            System.out.println("- Parasitic presence detected");
            System.out.println("  Severity: Moderate infestation");
        } 
        else if (parasiteN.equals("many")) {
            System.out.println("- Parasitic presence detected");
            System.out.println("  Severity: Heavy infestation");
        } 
        else {
            System.out.println("- Invalid parasite input (use: none, few, moderate, many)");
        }

        if (bloodN.contains("negative") &&
        mucusN.contains("negative") &&
        bacteriaN.contains("negative") &&
        parasiteN.equals("none")) {

        System.out.println("All findings are normal.");
}
        }
    }
