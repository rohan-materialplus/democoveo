//package com.microservice.searchservice.util;
//
//import java.util.regex.Pattern;
//
//public class SearchUtils {
//
//    private static final Pattern SPECIAL_CHARS = Pattern.compile("[^a-zA-Z0-9\\s]");
//
//    public static String sanitizeQuery(String query) {
//        if (query == null) return "";
//
//        // Remove special characters that might cause issues
//        String sanitized = SPECIAL_CHARS.matcher(query).replaceAll(" ");
//
//        // Remove extra whitespace
//        return sanitized.replaceAll("\\s+", " ").trim();
//    }
//
//    public static boolean isValidIsbn(String isbn) {
//        if (isbn == null) return false;
//
//        // Remove hyphens and spaces
//        isbn = isbn.replaceAll("[\\s-]", "");
//
//        // Check length (ISBN-10 or ISBN-13)
//        return isbn.length() == 10 || isbn.length() == 13;
//    }
//}