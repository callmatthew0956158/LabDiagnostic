public class biling extends Information {

    double cash;
    double change;

    public biling(String patientname, String birthdate, int sampleid,
                  String address, int age, String sex,
                  String date, String time, int lastmeal,
                  String request, double Sumof, double payment,
                  String physician, double cash) {

        super(patientname, birthdate, sampleid, address, age, sex,
              date, time, lastmeal, request, Sumof, payment, physician);

        this.cash = cash;
        this.change = cash - payment;
    }

    public void showBill() {

        System.out.println("\n===== BILLING =====");
        System.out.println("Patient ID   : " + sampleid);
        System.out.println("Patient Name : " + patientname);
        System.out.println("Physician    : " + physician);

        System.out.printf("Total Amount : Php%.2f%n", payment);
        System.out.printf("Cash         : Php%.2f%n", cash);
        System.out.printf("Change       : Php%.2f%n", change);

        if (cash < payment) {
            System.out.println("Status       : Not enough payment!");
        } else {
            System.out.println("Status       : Paid");
        }
    }
}