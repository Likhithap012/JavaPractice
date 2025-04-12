package com.gevernova.oops.eCommerceapalatform;

// Updated interface
interface Taxable {
    double calculateTax();     // Calculates tax

    double getTaxDetails();    // Returns the tax amount (can be same as calculateTax)
}
