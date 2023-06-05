package com.example.psn_interface.repositories;
import com.example.psn_interface.entities.Post;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PostRepository {

    private final HttpGraphQlClient graphQlClient;

    public PostRepository() {
        WebClient client = WebClient.builder()
                //URL de la API
                .baseUrl("http://34.138.199.167/")
                .build();
        graphQlClient = HttpGraphQlClient.builder(client).build();
    }

    public Post getPost() {
        //language=GraphQL
        String document = "query {\n" +
                  "    findWelcomePost {\n" +
                  "        _id\n" +
                  "        ownerId\n" +
                  "        location\n" +
                  "        description\n" +
                  "    }\n" +
        "}";

        var response = graphQlClient.document(document).retrieve("findWelcomePost");
        System.out.println(response);

        /*response.subscribe(
                post -> {
                    System.out.println("Consulta exitosa:");
                    System.out.println(post);
                },
                error -> {
                    System.out.println(error);
                }
        );


        url = "https://api.skillsly.app/graphql";

        UserDto result = new UserDto();

        final String query = GraphqlSchemaReaderUtil.getSchemaFromFileName("getUserDetails.graphql");

        WebClient webClient = WebClient.builder().build();
        GraphqlRequestBody graphQLRequestBody = new GraphqlRequestBody();

        final String variables = GraphqlSchemaReaderUtil.getSchemaFromFileName("variables.graphql");

        graphQLRequestBody.setQuery(query);
        graphQLRequestBody.setVariables(variables.replace("userId", userId));

        var res = webClient.post().uri(url).bodyValue(graphQLRequestBody).retrieve().bodyToMono(UserResponseDto.class)
                .block();

        assert res != null;
        result.setEmail(res.getData().getUser().getEmail());
        result.setName(res.getData().getUser().getName());
        result.setId(res.getData().getUser().getId());
        return result;
         */


        return response;
    }
}
