public class FindingsCalculation extends ChemistryTest {

    public FindingsCalculation(double fbs, double rbs, double totalchol, double hdl,
                               double ldl, double triglycerides, double creatinine,
                               double uricacid, double bun, double ast, double alt,
                               double sodium, double potassium, double chloride,
                               double tcalcium, double icalcium,
                               double glucose, double whiteBloodCells, double iron){

        super(fbs, rbs, totalchol, hdl,
              ldl, triglycerides, creatinine,
              uricacid, bun, ast, alt,
              sodium, potassium, chloride,
              tcalcium, icalcium,
              glucose, whiteBloodCells, iron);
    }
public double getPrice(int i) {
    switch (i) {
        case 0: 
        return 110; // FBS
        case 1: 
        return 150; // RBS
        case 2: 
        return 200; // Cholesterol
        case 3: 
        return 200; // HDL
        case 4: 
        return 200; // LDL
        case 5: 
        return 180; // Triglycerides
        case 6: 
        return 300; // Creatinine
        case 7: 
        return 130; // Uric Acid
        case 8: 
        return 150; // BUN
        case 9: 
        return 160; // AST
        case 10: 
        return 170; // ALT
        case 11: 
        return 450; // Sodium
        case 12: 
        return 300; // Potassium
        case 13: 
        return 100; // Chloride
        case 14: 
        return 130; // Total Calcium
        case 15: 
        return 130; // Ionized Calcium
        case 16:
        return 140; //Glucose
        case 17:
            return 180; // WhiteBloodCells
        case 18: //iron
            return 140;
        default: 
        return 0;
    }
}
}