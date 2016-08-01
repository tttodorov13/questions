package com.ui;

import java.io.*;
import java.net.*;

import com.Client;
import com.Link;
import com.Queries;

public class TCPClient {
	public static void main(String argv[]) throws Exception {
		String sentence;
		String modifiedSentence;
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		Socket clientSocket = new Socket("localhost", 6789);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		sentence = inFromUser.readLine();
		outToServer.writeBytes(sentence + '\n');
		modifiedSentence = inFromServer.readLine();
		if (modifiedSentence.equalsIgnoreCase("Query1")) {
			Queries q = new Queries();
			System.out.println(q.query1());
		} else if (modifiedSentence.equalsIgnoreCase("Query1Add")) {
			System.out.print("Write Query1: ");
			BufferedReader query1 = new BufferedReader(new InputStreamReader(System.in));
			Queries q = new Queries();
			Client client = new Client(query1.toString());
			client.adjacencies = new Link[] {};
			q.clients.add(client);
		} else if (modifiedSentence.equalsIgnoreCase("Query2")) {
			Queries q = new Queries();
			System.out.println(q.query2());
		} else {
			System.out.println("FROM SERVER: " + modifiedSentence);
		}
		clientSocket.close();
	}
}
