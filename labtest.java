public class labtest extends Information {

    String[] tests;
    boolean[] selected;
    double[] results;

    public labtest(String patientname, String birthdate, int sampleid,
                   String address, int age, String sex,
                   String date, String time, int lastmeal,
                   String request, double Sumof, double payment,
                   String physician,
                   String[] tests, boolean[] selected, double[] results) {

        super(patientname, birthdate, sampleid, address, age, sex,
              date, time, lastmeal, request, Sumof, payment, physician);

        this.tests = tests;
        this.selected = selected;
        this.results = results;
    }

    public void showResults() {

        String diagnosis = "All results are normal.";

        System.out.println("\n===== LAB RESULTS =====");
        System.out.println("Patient ID: " + sampleid);
        System.out.println("Patient: " + patientname);
        System.out.println("Payment: Php" + payment);
        System.out.println("------------------------------");

        for (int i = 0; i < tests.length; i++) {

            if (!selected[i]) continue;

            double val = results[i];
            String status = "NORMAL";
            String ref = "";
            String disease = "None";

            switch (i) {

                case 0://fbs
                    ref = "74-100";
                    if (val < 74) status = "LOW";
                    else if (val > 100) {
                        status = "HIGH";
                        disease = "Possible Diabetes";
                        diagnosis = disease;
                    }
                    break;

                case 1://rbs
                    ref = "70-140";
                    if (val < 70) status = "LOW";
                    else if (val > 140) {
                        status = "HIGH";
                        disease = "Possible Diabetes";
                        diagnosis = disease;
                    }
                    break;

                case 2://cholesterol
                    ref = "150-200";
                    if (val > 200) {
                        status = "HIGH";
                        disease = "Hypercholesterolemia";
                        diagnosis = disease;
                    }
                    break;

                case 3://hdl
                    ref = (sex.equals("M")) ? "35-80" : "42-88";
                    if ((sex.equals("M") && val < 35) ||
                        (sex.equals("F") && val < 42)) {
                        status = "LOW";
                        disease = "Heart Risk";
                    }
                    break;

                case 4://ldl
                    ref = "50-130";
                    if (val > 130) {
                        status = "HIGH";
                        disease = "Heart Risk";
                        diagnosis = disease;
                    }
                    break;

                case 5://triglycerides
                    ref = (sex.equals("M")) ? "60-165" : "40-140";
                    if (val > (sex.equals("M") ? 165 : 140)) {
                        status = "HIGH";
                        disease = "Hypertriglyceridemia";
                        diagnosis = disease;
                    }
                    break;

                case 6://creatinine
                    ref = (sex.equals("M")) ? "0.9-1.3" : "0.6-1.2";
                    if (val > (sex.equals("M") ? 1.3 : 1.2)) {
                        status = "HIGH";
                        disease = "Kidney Dysfunction";
                        diagnosis = disease;
                    }
                    break;

                case 7://uricacid
                    ref = "3.5-7.2";
                    if (val > 7.2) {
                        status = "HIGH";
                        disease = "Gout";
                        diagnosis = disease;
                    }
                    break;

                case 8://bun
                    ref = "7-20";
                    if (val > 20) {
                        status = "HIGH";
                        disease = "Kidney Problem";
                        diagnosis = disease;
                    }
                    break;

                case 9://ast
                    ref = "10-40";
                    if (val > 40) {
                        status = "HIGH";
                        disease = "Liver Damage";
                        diagnosis = disease;
                    }
                    break;

                case 10: //alt
                    ref = "7-56";
                    if (val > 56) {
                        status = "HIGH";
                        disease = "Liver Disease";
                        diagnosis = disease;
                    }
                    break;

                case 11://sodium
                    ref = "135-145";
                    if (val < 135) status = "LOW";
                    else if (val > 145) status = "HIGH";
                    break;

                case 12://potasium
                    ref = "3.5-5.0";
                    if (val > 5.0) status = "HIGH";
                    break;

                case 13://chloride
                    ref = "96-106";
                    if (val > 106) status = "HIGH";
                    break;

                case 14:// totalcalcium
                    ref = "8.5-10.5";
                    if (val > 10.5) status = "HIGH";
                    break;

                case 15://ionized calcium
                    ref = "4.5-5.6";
                    if (val > 5.6) status = "HIGH";
                    break;
                case 16://glucose
                    ref =  "70-99";
                    if (val > 99) 
                        status = "HIGH";
                        disease = "Diabetes";
                        diagnosis = disease;
                    break;
                    
                case 17: //whitebloodcells
                ref = " 3.0-10";
                if (val > 10)
                    status = "HIGH";
                break;
                
                case 18: //Iron
                ref ="5.8-34.5";
                if(val >34.5)
                    status = "HIGH";
                break;

            }

            System.out.printf("%-20s Result: %.2f | Ref: %s | %s%n",
                    tests[i], val, ref, status);
        }

        System.out.println("\n===== FINAL DIAGNOSIS =====");
        System.out.println(diagnosis);
    }
}