import java.util.List;
import java.util.ArrayList;

public class PathFinder {
	// When finding user position
	public Vertex findClosestVertex(int x, int y) {
		return new Vertex("test", new Position(x, y));
	}
	
	// When finding target position on click, target to building
	public List<Vertex> findShortestPath(Vertex source, Building target) {
		List<Vertex> path = new ArrayList<>();
		return path;
	}
	
	// When finding target position with category
	public List<Vertex> findShortestPath(Vertex source, String category) {
		List<Vertex> path = new ArrayList<>();
		return path;
	}
	
	public Room findClosestRoom(Vertex source, String category) {
		return new Room();
	}
	
	// Set buildings info when initilizing
	public List<Building> getAllBuildingInfos(){
		List<Building> buildings = new ArrayList<>();
		return buildings;
	}
}
