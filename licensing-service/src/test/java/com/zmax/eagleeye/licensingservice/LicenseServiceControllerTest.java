package com.zmax.eagleeye.licensingservice;

import com.zmax.eagleeye.licensingservice.Controller.LicenseServiceController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(LicenseServiceController.class)
public class LicenseServiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getLicenseIdAndOrganizationId() throws Exception{
        mockMvc.perform(get("/v1/organizations/10/licenses/10"))
                .andExpect(status().isOk())
        .andExpect(jsonPath("id").value("10"))
        .andExpect(jsonPath("organizationId").value("10"));
    }
    @Test
    public void postLicens() throws Exception{
        mockMvc.perform(post("/v1/organizations/10/licenses/10")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
        ;

    }
    @Test
    public void putLicens() throws Exception{
        mockMvc.perform(put("/v1/organizations/10/licenses/10")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
        ;

    }


}
