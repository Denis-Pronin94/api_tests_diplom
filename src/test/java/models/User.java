package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String email;
    private String password;
    private String id;
    private String token;
    private String error;
    private String name;
    private String job;
    private String page;
    private String per_page;
    private String total;
    private String total_pages;
}
