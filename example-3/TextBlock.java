import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.nio.file.Paths;
import java.nio.file.Path;

void main(){

        String body=STR."""
		
                {
                "name": "Barcamp Testing",
                "data": {
                "year": 2023,
                "price": 1000.00,
                "talk": "Why should you learn Java",
                "Speaker": "Brayan M."
                        }
                }
                """;


        try{
        postJSON("https://api.restful-api.dev/objects",body);

        //get("https://api.restful-api.dev/objects?id=");
        }catch(Exception e){
        System.out.println("Something happens... "+e.getMessage());
        }
        }


public CompletableFuture<Path> postJSON(String uri,String body)
        throws IOException {

        HttpRequest request=HttpRequest.newBuilder(URI.create(uri))
        .header("Content-Type","application/json")
        .POST(HttpRequest.BodyPublishers.ofString(body))
        .build();

        return HttpClient.newHttpClient()
        .sendAsync(request, HttpResponse.BodyHandlers.ofFile(Paths.get("post-response.json")))
        .thenApply(HttpResponse::body);
}




public CompletableFuture<Path> get(String uri) {

		try(HttpClient client = HttpClient.newHttpClient()) {

		HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create(uri))
		.GET()
		.build();


		return client.sendAsync(request, HttpResponse.BodyHandlers.ofFile(Paths.get("get-response.json")))
			.thenApply(HttpResponse::body);
		}
}
