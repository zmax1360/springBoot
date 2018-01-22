package com.zmax.eagleeye.licensingservice.model;

import java.util.Objects;

public class License {
    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof License)) return false;
        License license = (License) o;
        return Objects.equals(getId(), license.getId()) &&
                Objects.equals(getOrganizationId(), license.getOrganizationId()) &&
                Objects.equals(getProductName(), license.getProductName()) &&
                Objects.equals(getLicenseType(), license.getLicenseType());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getOrganizationId(), getProductName(), getLicenseType());
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public License withId(String id) {
        this.setId( id );
        return this;
    }

    public License withOrganizationId(String organizationId) {
        this.setOrganizationId(organizationId);
        return this;
    }
    public License withProductName(String productName){
        this.setProductName(productName);
        return this;
    }

    public License withLicenseType(String licenseType){
        this.setLicenseType(licenseType);
        return this;
    }
}
