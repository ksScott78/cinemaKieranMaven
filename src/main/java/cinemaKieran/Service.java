package cinemaKieran;

import java.util.HashMap;
import java.util.Map;

public class Service {
	private Map<Integer, Movie> movieMap;
	private int movieCounter;
	
	public Service() {
		 movieMap = new HashMap<Integer, Movie>();
	}

	public void addMovie(Movie m) {
		movieMap.put(movieCounter,m);
		movieCounter++;
	}
	
	public void deleteMovie(int movieToDelete) {
		movieMap.remove(movieToDelete);
	}
	
//	public Movie retrieveMovie(int movieToFind) {
//		return (movieMap.get(movieToFind));
//		
//	}
	
	public Map retrieveMap() {
		return movieMap;
	}
}
