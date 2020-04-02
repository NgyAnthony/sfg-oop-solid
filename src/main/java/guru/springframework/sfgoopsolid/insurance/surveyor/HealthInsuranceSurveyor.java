package guru.springframework.sfgoopsolid.insurance.surveyor;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("Validating Health Insurance...");
        return true;
    }
}
