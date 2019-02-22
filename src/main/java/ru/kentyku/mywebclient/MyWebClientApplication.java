package ru.kentyku.mywebclient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MyWebClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWebClientApplication.class, args);

    }
    @Bean
    public CommandLineRunner init() {

        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                WebClient client = WebClient.create("http://localhost:8080");
                WebClient.UriSpec<WebClient.RequestBodySpec> request = client.method(HttpMethod.GET);
                WebClient.RequestBodySpec uri = client
                        .method(HttpMethod.GET)
                        .uri("/resource");
            }
        };

    }
}
