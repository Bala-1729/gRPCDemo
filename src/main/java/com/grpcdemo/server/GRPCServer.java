package com.grpcdemo.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Hello from grpc server");
		
		Server server = ServerBuilder.forPort(6666)
				.addService(new GreetingServiceImpl())
				.addService(new SumServiceImpl())
				.build();
		
		server.start();
		
		System.out.println("Server started at "+server.getPort());
		
		server.awaitTermination();
	}

}
