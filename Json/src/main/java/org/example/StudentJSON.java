package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSON {
    public static void main(String[] args) {
        JSONObject student=new JSONObject();
        student.put("name","likhitha");
        student.put("age",21);
        JSONArray subjects=new JSONArray();
        subjects.put("maths");
        subjects.put("english");
        subjects.put("computer science");
        student.put("subjects",subjects);
        System.out.println(student.toString(4));
    }
}
