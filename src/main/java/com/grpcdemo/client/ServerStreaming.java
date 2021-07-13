package com.grpcdemo.client;

import com.proto.greet.greeting;
import com.proto.greet.greetingRequest;
import com.proto.greet.greetingServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ServerStreaming {

	public static void main(String[] args) {
		
		System.out.println("Hello from grpc client - server streaming");
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6666).usePlaintext().build();
		
		System.out.println("Creating stub");
		
		greetingServiceGrpc.greetingServiceBlockingStub stub = greetingServiceGrpc.newBlockingStub(channel);
		
		stub.greetManyTimes(greetingRequest.newBuilder().setGreeting(greeting.newBuilder().setFirstName("Balasubramaniam").setLastName("Anbu").build()).build()).forEachRemaining((res) ->{
			System.out.println(res.getResult());
		});
		
		System.out.println("Shutting down channel");

		channel.shutdown();
	}

}
