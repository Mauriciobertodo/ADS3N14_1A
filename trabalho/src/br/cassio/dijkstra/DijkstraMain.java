package br.cassio.dijkstra;

import java.util.List;
import br.cassio.dijkstra.bean.Edge;
import br.cassio.dijkstra.bean.Vertex;

public class DijkstraMain {
	
	public static void main(String[] args) {
		// mark all the vertices
		Vertex A = new Vertex("A", 0, 0);
		Vertex B = new Vertex("B", 1, 0);
		Vertex C = new Vertex("C", 1, 2);
		Vertex D = new Vertex("D", 0, 1);
//		Vertex F = new Vertex("F");
//		Vertex K = new Vertex("K");
//		Vertex J = new Vertex("J");
//		Vertex M = new Vertex("M");
//		Vertex O = new Vertex("O");
//		Vertex P = new Vertex("P");
//		Vertex R = new Vertex("R");
//		Vertex Z = new Vertex("Z");

		// set the edges and cost
		A.adjacencies = new Edge[] { new Edge(B, 1), new Edge(C, 2), new Edge(D, 1) };
		B.adjacencies = new Edge[] { new Edge(A, 1), new Edge(C, 2) };
		C.adjacencies = new Edge[] { new Edge(A, 2), new Edge(B, 2), new Edge(D, 3) };
		D.adjacencies = new Edge[] { new Edge(A, 1), new Edge(C, 3) };
//		F.adjacencies = new Edge[] { new Edge(K, 23) };
//		K.adjacencies = new Edge[] { new Edge(O, 40) };
//		J.adjacencies = new Edge[] { new Edge(K, 25) };
//		M.adjacencies = new Edge[] { new Edge(R, 8) };
//		O.adjacencies = new Edge[] { new Edge(K, 40) };
//		P.adjacencies = new Edge[] { new Edge(Z, 18) };
//		R.adjacencies = new Edge[] { new Edge(P, 15) };
//		Z.adjacencies = new Edge[] { new Edge(P, 18) };

		Dijkstra.computePaths(A); // run Dijkstra
		System.out.println("Distance to " + C + ": " + C.minDistance);
		List<Vertex> path = Dijkstra.getShortestPathTo(C);
		System.out.println("Path: " + path);
	}
}
