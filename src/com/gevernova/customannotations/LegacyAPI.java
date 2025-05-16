package com.gevernova.customannotations;

// Class with deprecated and new method
public class LegacyAPI {

    @Deprecated
    void oldFeature() {
        System.out.println("Warning: This feature is deprecated and should not be used.");
    }

    void newFeature() {
        System.out.println("This is the new and recommended feature.");
    }
}

// Main class to test the LegacyAPI
class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();  // ⚠️ Should show a warning in IDE
        api.newFeature();  // ✅ Recommended usage
    }
}

