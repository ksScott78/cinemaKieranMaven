package cinemaKieran;

import com.google.gson.Gson;

public class Main {
	

public static void main(String args[]) {
	Service movieService = new Service();
	Movie rambo = new Movie("Rambo", "Action", "15");
	Movie IT = new Movie("I.T", "Horror", "18");
	movieService.addMovie(rambo);
	movieService.addMovie(IT);
	Gson gson = new Gson();
	System.out.println(gson.toJson(movieService.retrieveMap()));
	
}


}
