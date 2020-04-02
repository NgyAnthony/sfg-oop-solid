package guru.springframework.sfgoopsolid.insurance.manager;

import guru.springframework.sfgoopsolid.insurance.surveyor.InsuranceSurveyor;

public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("Claim approval manager: valid claim.");
        }
    }
}
