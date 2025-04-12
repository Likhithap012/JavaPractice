package com.gevernova.objectrelationshipsandcommunication.companyanddepartments;

// Main class
class CompanyComposition {
    public static void main(String[] args) {
        Company company = new Company("TechNova");

        // Add departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Add employees to departments
        Department itDept = company.getDepartment("IT");
        itDept.addEmployee("Likhitha");
        itDept.addEmployee("Ananya");

        Department hrDept = company.getDepartment("HR");
        hrDept.addEmployee("Ravi");

        // Show all details
        company.showCompanyDetails();

        System.out.println("\nDeleting company...\n");

        // Delete the company
        company.deleteCompany();
    }
}
