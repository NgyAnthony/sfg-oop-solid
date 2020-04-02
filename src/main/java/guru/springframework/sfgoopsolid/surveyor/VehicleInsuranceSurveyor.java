package guru.springframework.sfgoopsolid.surveyor;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {

    @Override
    public boolean isValidClaim() {
        System.out.println("Validating VehicleInsurance...");
        return true;
    }
}
