package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.model.cliente;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
@Configuration
public class ClientConfig {
    @Bean
    public WebClient getWebClient() {
        return WebClient.builder().baseUrl("http://localhost:9001").build();
    }

}
