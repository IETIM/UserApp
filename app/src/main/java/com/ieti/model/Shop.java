package com.ieti.model;

public class Shop {

    private String id;

    private String name;

    private String location;

    private String type;

    private String apiClient;

    private String apiSecret;

    public Shop() {
    }

    public Shop(String name, String location, String type) {
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getApiClient() {
        return apiClient;
    }

    public void setApiClient(String apiClient) {
        this.apiClient = apiClient;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

}
