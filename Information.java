public class Information {
    protected String patientname;
    protected String birthdate;
    protected int sampleid;
    protected String date, address;
    protected int age;
    protected String sex, time;
    protected int lastmeal;
    protected String request;
    protected double Sumof;
    protected double payment;
    protected String physician;

    Information(String patientname, String birthdate, int sampleid,
                String address, int age, String sex,
                String date, String time,
                int lastmeal, String request, double Sumof, double payment, String physician) {

        this.patientname = patientname;
        this.birthdate = birthdate;
        this.sampleid = sampleid;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.date = date;
        this.time = time;
        this.lastmeal = lastmeal;
        this.request = request;
        this.Sumof = Sumof;
        this.payment = payment;
        this.physician = physician;
    }
}