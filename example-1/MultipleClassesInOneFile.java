import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class MultipleClassesInOneFile {
	public static void main(String... args){
		
		var dummyVariable = args.length >= 1 ? args[0] : "(Ran without arguments)";

		System.out.println(HelloMessage.helloMessage() + 
				WorldMessage.worldMessage() + 
				FromMessage.fromMessage() + 
				dummyVariable
				);

	}



class HelloMessage {
	static String helloMessage(){
		return "Hello, ";
	}
}


class WorldMessage {
	static String worldMessage(){
		return "World "; 
	}
}


class FromMessage{
	static String fromMessage(){
		return "from ";  
	}
}
	public CompletableFuture<Void> postJSON(URI uri, String body)
			throws IOException
	{

		HttpRequest request=HttpRequest.newBuilder(uri)
				.header("Content-Type","application/json")
				.POST(HttpRequest.BodyPublishers.ofString(body))
				.build();

		return HttpClient.newHttpClient()
				.sendAsync(request, HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::statusCode)
				.thenAccept(System.out::println);
	}


}
