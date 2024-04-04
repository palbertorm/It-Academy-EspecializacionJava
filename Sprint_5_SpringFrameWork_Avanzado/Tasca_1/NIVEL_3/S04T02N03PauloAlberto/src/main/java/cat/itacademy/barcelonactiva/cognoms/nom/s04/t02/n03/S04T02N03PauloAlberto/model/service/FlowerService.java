package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.model.service;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.model.cliente.ClientConfig;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.model.domain.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FlowerService {
    private final ClientConfig clientConfig;
    @Autowired
    private WebClient webClient;
    @Autowired
    public FlowerService(ClientConfig webClientConfig) {
        this.clientConfig = webClientConfig;
        this.webClient = webClientConfig.getWebClient();

    }


    public Mono<Flower>getflowerId(int id) {
       return webClient.get()
                .uri("/flower/{id}", id)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(Flower.class);


    }

    public Flux<Flower> getFlowerList() {
        return webClient.get()
                        .uri("/flower/getAll")
                        .retrieve()
                        .bodyToFlux(Flower.class);


    }

    public Mono<Flower> createFlower(Flower flower){
        return webClient.post()
                .uri("/flower/add")
                .retrieve()
                .bodyToMono(Flower.class);
    }
}
