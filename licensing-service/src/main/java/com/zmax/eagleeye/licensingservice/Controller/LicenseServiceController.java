package com.zmax.eagleeye.licensingservice.Controller;

import com.zmax.eagleeye.licensingservice.model.License;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

@GetMapping( value = "/{licenseId}")
    public License getLicenses(@PathVariable("organizationId") String organizationId
        ,@PathVariable("licenseId") String licenseId) {

        return new License()
                .withId("10")
                .withOrganizationId(organizationId)
                .withProductName("Teleco")
                .withLicenseType("Seat");
    }
@PostMapping(value = "/{licenseId}")
    public String saveLicense(@PathVariable("licenseId") String licenseId){
    return "POST";
    }
    @PutMapping(value = "/{licenseId}")
    public String updateLicense(@PathVariable("licenseId") String licenseId){
        return "Put";
    }

}

