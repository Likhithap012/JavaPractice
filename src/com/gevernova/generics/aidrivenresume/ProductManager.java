package com.gevernova.generics.aidrivenresume;

// Product Manager role
class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluateResume() {
        System.out.println(candidateName + "'s resume screened for Product Manager: Skills - Roadmaps, UX, Market Fit.");
    }
}
