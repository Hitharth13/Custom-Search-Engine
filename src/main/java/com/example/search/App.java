package com.example.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@RestController
public class App {

    private static final String GOOGLE_API_KEY = System.getenv("GOOGLE_SEARCH_API_KEY");
    private static final String GOOGLE_CX_ID = System.getenv("GOOGLE_SEARCH_CX_ID");
    private static final String SEARCH_URL = "https://www.googleapis.com/customsearch/v1";

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/api/search")
    public ResponseEntity<String> search(
            @RequestParam String q,
            @RequestParam(defaultValue = "1") int start) {

        if (GOOGLE_API_KEY == null || GOOGLE_CX_ID == null) {
            return ResponseEntity.badRequest()
                    .body("{\"error\": \"API credentials not configured\"}");
        }

        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = String.format("%s?key=%s&cx=%s&q=%s&start=%d",
                    SEARCH_URL, GOOGLE_API_KEY, GOOGLE_CX_ID, q, start);

            String response = restTemplate.getForObject(url, String.class);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
}
