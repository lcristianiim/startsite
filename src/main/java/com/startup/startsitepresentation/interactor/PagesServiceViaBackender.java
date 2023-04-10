package com.startup.startsitepresentation.interactor;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.componenter.Page;

public class PagesServiceViaBackender implements PagesService {
    String backenderAddress = "localhost:8090";
    @Override
    public Page getPageByURL(String url) {

        Unirest.setTimeouts(0, 0);
        try {
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.get("http://localhost:8090/getPage/homepage")
                    .asString();
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response.getBody(), Page.class);

        } catch (UnirestException e) {
            throw new CouldNotGetPageFromBackenderException("Request failed for getting the page with url: " + url);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static class CouldNotGetPageFromBackenderException extends RuntimeException {
        public CouldNotGetPageFromBackenderException(String message) {
            super(message);
        }
    }
}
