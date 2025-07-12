package Question6;

public interface BillingProcessor {
    boolean processBill(String patientId, double amount);
    default void printDetailedBill(String patientId, double amount){
        if(processBill(patientId, amount)){
            formatDetailedBill(patientId, amount);
        }
    }
    private void formatDetailedBill(String patientId, double amount){
        System.out.println("Hospital Bill for Patient " + patientId +": " + amount + "processed");
    }

    static boolean validateInsuranceID(String insuranceID){
        return insuranceID.length() == 10;
    }

    static boolean validatePatientId(String patientId){
        return (patientId.length() == 8) && (patientId.startsWith("HSP"));
    }


}
