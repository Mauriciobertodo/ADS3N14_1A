package br.cassio.dijkstra.bean;

public class Vertex implements Comparable<Vertex> {
	public final String name;
	public final double coordinateX;
	public final double coordinateY;
	
	public Edge[] adjacencies;
	public double minDistance = Double.POSITIVE_INFINITY;
	public Vertex previous;

	public Vertex(String argName, double x, double y) {
		name = argName;
		coordinateX = x;
		coordinateY = y;
	}

	public String toString() {
		return name;
	}
	
	/**
	 * Implentacao do metodo de interface Comparable
	 */
	public int compareTo(Vertex other) {
		return Double.compare(minDistance, other.minDistance);
	}
}