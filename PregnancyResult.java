public class PregnancyResult extends pregnancytest {

    public PregnancyResult(boolean hcg) {
        super(hcg);
    }

    public void showResult() {

        System.out.println("\n===== PREGNANCY TEST =====");

        if (hcg) {
            System.out.println("Result: POSITIVE");
        } else {
            System.out.println("Result: NEGATIVE");
        }
    }
}