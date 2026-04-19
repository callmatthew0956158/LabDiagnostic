import java.util.Scanner;
public class clinicmain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //PATIENT INFO 
        System.out.print("Patient Name: ");
        String patientname = input.nextLine();

        System.out.print("Birthdate: ");
        String birthdate = input.nextLine();

        System.out.print("Sample ID: ");
        int sampleid = input.nextInt();
        input.nextLine();

        System.out.print("Address: ");
        String address = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Sex (M/F): ");
        String sex = input.nextLine();

        System.out.print("Date of Collection: ");
        String date = input.nextLine();

        System.out.print("Time of Collection: ");
        String time = input.nextLine();

        System.out.print("Hours since last meal: ");
        int lastmeal = input.nextInt();
        input.nextLine();

        System.out.print("Request: ");
        String request = input.nextLine();

        System.out.print("Physician: ");
        String physician = input.nextLine();


        //MENU 
        System.out.println("\n===== CLINIC TEST MENU =====");
        System.out.println("1. Blood Test");
        System.out.println("2. Stool Test");
        System.out.println("3. Urinalysis");
        System.out.println("4. Pregnancy Test");

        System.out.print("Choose test: ");
        int menu = input.nextInt();
        input.nextLine();

        //BLOOD TEST 
        if (menu == 1) {

            String[] tests = {
                "FBS","RBS","Cholesterol","HDL","LDL",
                "Triglycerides","Creatinine","Uric Acid",
                "BUN","AST","ALT","Sodium","Potassium",
                "Chloride","Total Calcium","Ionized Calcium", 
                "Glucose","WhiteBloodCells","Iron"
            };

            boolean[] selected = new boolean[tests.length];
            double[] results = new double[tests.length];

            System.out.println("\nSelect tests (example: 1,2,3): ");
            for (int i = 0; i < tests.length; i++) {
                System.out.println((i + 1) + ". " + tests[i]);
            }

            String choice = input.nextLine();
            String[] picks = choice.split(",");

            for (String p : picks) {
                int i = Integer.parseInt(p.trim()) - 1;
                selected[i] = true;

                System.out.print("Enter result for " + tests[i] + ": ");
                results[i] = input.nextDouble();
            }
            input.nextLine();

          FindingsCalculation calc = new FindingsCalculation(
            results[0], results[1], results[2], results[3],
            results[4], results[5], results[6], results[7],
            results[8], results[9], results[10], results[11],
            results[12], results[13], results[14], results[15],
            results[16], results[17], results[18]
);

            double totalPayment = 0;

            System.out.println("\n===== TEST BILL =====");

            for (int i = 0; i < tests.length; i++) {
                if (selected[i]) {
                    double price = calc.getPrice(i);
                    System.out.println(tests[i] + " - Php " + price);
                    totalPayment += price;
                }
            }

            System.out.println("Total Payment: Php" + totalPayment);

            double payment = totalPayment;
            double Sumof = totalPayment;

            System.out.print("Enter Cash: ");
            double cash = input.nextDouble();

            labtest lab = new labtest(
                    patientname, birthdate, sampleid, address, age, sex,
                    date, time, lastmeal, request, Sumof, payment,
                    physician,
                    tests, selected, results
            );

            lab.showResults();

            biling bill = new biling(
                    patientname, birthdate, sampleid, address, age, sex,
                    date, time, lastmeal, request, Sumof, payment,
                    physician,
                    cash
            );

            bill.showBill();
        }

     else if (menu == 2) {
        System.out.println("\n===== STOOL TEST =====");

        System.out.print("Color: ");
        String color = input.nextLine();

        System.out.print("Consistency: ");
        String consistency = input.nextLine();

        System.out.print("Blood (positive/negative): ");
        String blood = input.nextLine();

        System.out.print("Mucus (positive/negative): ");
        String mucus = input.nextLine();

        System.out.print("Parasites (none/few/moderate/many): ");
        String parasites = input.nextLine();

        System.out.print("Bacteria (positive/negative): ");
        String bacteria = input.nextLine();

        StoolFindings stool = new StoolFindings(
         color, consistency, blood, mucus, parasites, bacteria
    );

        stool.showStoolResults();

        double totalPayment = 350;

        System.out.println("\n===== BILLING =====");
        System.out.println("Total Amount: Php " + totalPayment);

        System.out.print("Enter Cash: ");
        double cash = input.nextDouble();

        System.out.println("Change: Php " + (cash - totalPayment));
}

       //URINALYSIS 
        else if (menu == 3) {

        System.out.println("\n===== URINALYSIS =====");

        System.out.print("Color: ");
        String color = input.nextLine();

        System.out.print("Clarity: ");
        String clarity = input.nextLine();

        System.out.print("Glucose (true/false): ");
        boolean glucose = input.nextBoolean();

        System.out.print("Protein (true/false): ");
        boolean protein = input.nextBoolean();
        input.nextLine();

   
        System.out.print("Bacteria (none/few/many): ");
        String bacteria = input.nextLine();

        System.out.print("Urine pH level (e.g. 5.5 - 8.0): ");
        double ph = input.nextDouble();
        input.nextLine();

        UrineFindings urine = new UrineFindings(
        color, clarity, glucose, protein, bacteria, ph
    );
        urine.showUrineResults();

        double totalPayment = 380;

        System.out.println("\n===== BILLING =====");
        System.out.println("Total Amount: Php " + totalPayment);

        System.out.print("Enter Cash: ");
        double cash = input.nextDouble();

        double change = cash - totalPayment;

        System.out.println("Change: Php " + change);
}
    else if (menu == 4) {

        System.out.println("\n===== PREGNANCY TEST =====");

        System.out.print("hCG detected? (true/false): ");
        boolean hcg = input.nextBoolean();

        PregnancyResult preg = new PregnancyResult(hcg);

    
        preg.showResult();

        double totalPayment = 250;

        System.out.println("\n===== BILLING =====");
        System.out.println("Total Amount: Php " + totalPayment);

        System.out.print("Enter Cash: ");
        double cash = input.nextDouble();

        double change = cash - totalPayment;

        System.out.println("Change: Php " + change);
}
        input.close();
    }
    
}