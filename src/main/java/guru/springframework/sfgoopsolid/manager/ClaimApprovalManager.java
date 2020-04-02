package guru.springframework.sfgoopsolid.manager;

import guru.springframework.sfgoopsolid.surveyor.InsuranceSurveyor;

public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("Claim approval manager: valid claim.");
        }
    }
}
