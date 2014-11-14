package br.cassio.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import br.cassio.dijkstra.bean.Edge;
import br.cassio.dijkstra.bean.Vertex;

public class Dijkstra {
	public static void computePaths(final Vertex origin) {
		origin.minDistance = 0d;
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
		vertexQueue.add(origin);

		while (!vertexQueue.isEmpty()) {
			final Vertex u = vertexQueue.poll();

			// Visit each edge exiting u
			for (final Edge e : u.adjacencies) {
				final Vertex v = e.target;
				
				// tamanho total percorrido no vertice mais a aresta
				final double weight = e.getDistanceFrom(u) + e.cost;
				
				final double distanceThroughU = u.minDistance + weight;
				if (distanceThroughU < v.minDistance) {
					vertexQueue.remove(v);

					v.minDistance = distanceThroughU;
					v.previous = u;
					vertexQueue.add(v);
				}
			}
		}
	}

	public static List<Vertex> getShortestPathTo(final Vertex target) {
		final List<Vertex> path = new ArrayList<Vertex>();
		
		for (Vertex vertex = target; vertex != null; vertex = vertex.previous) {
			path.add(vertex);
		}
		
		// revira a lista
		Collections.reverse(path);
		// retorna o valor revirado
		return path;
	}
}