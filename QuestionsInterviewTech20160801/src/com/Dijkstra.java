package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
	public static void computePaths(Client source) {
		source.minDistance = 0.0;
		PriorityQueue<Client> vertexQueue = new PriorityQueue<Client>();
		vertexQueue.add(source);

		while (!vertexQueue.isEmpty()) {
			Client u = vertexQueue.poll();

			// Visit each edge exiting u
			for (Link e : u.adjacencies) {
				Client v = e.target;
				double weight = e.weight;
				double distanceThroughU = u.minDistance + weight;
				if (distanceThroughU < v.minDistance) {
					vertexQueue.remove(v);
					v.minDistance = distanceThroughU;
					v.previous = u;
					vertexQueue.add(v);
				}
			}
		}
	}

	public static List<Client> getShortestPathTo(Client target) {
		List<Client> path = new ArrayList<Client>();
		for (Client vertex = target; vertex != null; vertex = vertex.previous) {
			path.add(vertex);
		}
		Collections.reverse(path);
		return path;
	}
}