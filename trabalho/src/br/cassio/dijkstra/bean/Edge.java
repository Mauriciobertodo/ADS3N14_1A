package br.cassio.dijkstra.bean;

import br.cassio.dijkstra.utils.DistanceCalculator;

public class Edge {
	public final Vertex target;
	public final double cost;

	public Edge(Vertex argTarget, double argCost) {
		target = argTarget;
		cost = argCost;
	}
	
	public double getDistanceFrom(final Vertex origin) {
		return DistanceCalculator.distanceBetween(origin.coordinateX, origin.coordinateY, target.coordinateX, target.coordinateY);
	}
}