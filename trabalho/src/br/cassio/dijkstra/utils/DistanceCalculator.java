package br.cassio.dijkstra.utils;

public class DistanceCalculator {
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}
}
