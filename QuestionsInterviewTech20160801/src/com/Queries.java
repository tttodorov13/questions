package com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Queries {

	public List<Client> clients = new ArrayList<Client>();
	FileReader in = null;
	FileWriter out = null;

	public String query1() {

		// mark all the vertices
		Client A = new Client("A");
		Client B = new Client("B");
		Client D = new Client("D");
		Client F = new Client("F");
		Client K = new Client("K");
		Client J = new Client("J");
		Client M = new Client("M");
		Client O = new Client("O");
		Client P = new Client("P");
		Client R = new Client("R");
		Client Z = new Client("Z");

		// set the edges and weight
		A.adjacencies = new Link[] { new Link(M, 8) };
		B.adjacencies = new Link[] { new Link(D, 11) };
		D.adjacencies = new Link[] { new Link(B, 11) };
		F.adjacencies = new Link[] { new Link(K, 23) };
		K.adjacencies = new Link[] { new Link(O, 40) };
		J.adjacencies = new Link[] { new Link(K, 25) };
		M.adjacencies = new Link[] { new Link(R, 8) };
		O.adjacencies = new Link[] { new Link(K, 40) };
		P.adjacencies = new Link[] { new Link(Z, 18) };
		R.adjacencies = new Link[] { new Link(P, 15) };
		Z.adjacencies = new Link[] { new Link(P, 18), new Link(R, 22) };

		clients.add(A);
		clients.add(B);
		clients.add(D);
		clients.add(F);
		clients.add(K);
		clients.add(J);
		clients.add(M);
		clients.add(O);
		clients.add(P);
		clients.add(R);
		clients.add(Z);

		try {
			FileOutputStream fout = new FileOutputStream("clients.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(clients);
			oos.close();
		} catch (IOException e) {
			System.out.print("IOException: " + e.getMessage());
		}

		String result = "";

		for (Client c : clients) {
			result += new String("I am Client " + c.name + " and my neightbors are ");
			for (Link cNeightbor : c.adjacencies) {
				result += new String(cNeightbor.target.name + ", ");
			}
			result += new String("\n");
		}
		return result;
	}

	public String query2() {
		// mark all the vertices
		Client A = new Client("A");
		Client B = new Client("B");
		Client D = new Client("D");
		Client F = new Client("F");
		Client K = new Client("K");
		Client J = new Client("J");
		Client M = new Client("M");
		Client O = new Client("O");
		Client P = new Client("P");
		Client R = new Client("R");
		Client Z = new Client("Z");

		// set the edges and weight
		A.adjacencies = new Link[] { new Link(M, 8) };
		B.adjacencies = new Link[] { new Link(D, 11) };
		D.adjacencies = new Link[] { new Link(B, 11) };
		F.adjacencies = new Link[] { new Link(K, 23) };
		K.adjacencies = new Link[] { new Link(O, 40) };
		J.adjacencies = new Link[] { new Link(K, 25) };
		M.adjacencies = new Link[] { new Link(R, 8) };
		O.adjacencies = new Link[] { new Link(K, 40) };
		P.adjacencies = new Link[] { new Link(Z, 18) };
		R.adjacencies = new Link[] { new Link(P, 15) };
		Z.adjacencies = new Link[] { new Link(P, 18), new Link(R, 22) };

		clients.add(A);
		clients.add(B);
		clients.add(D);
		clients.add(F);
		clients.add(K);
		clients.add(J);
		clients.add(M);
		clients.add(O);
		clients.add(P);
		clients.add(R);
		clients.add(Z);

		String result = "";

		Dijkstra.computePaths(A); // run Dijkstra
		result += new String("Distance to " + Z + ": " + Z.minDistance);
		List<Client> path = Dijkstra.getShortestPathTo(Z);
		result += new String("\nPath: " + path);
		return result;
	}
}
