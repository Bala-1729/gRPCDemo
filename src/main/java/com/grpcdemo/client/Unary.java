package com.grpcdemo.client;

import com.proto.greet.greeting;
import com.proto.greet.greetingRequest;
import com.proto.greet.greetingResponse;
import com.proto.greet.greetingServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Unary {

	public static void main(String[] args) {
		
		System.out.println("Hello from grpc client - unary");

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6666).usePlaintext().build();

		System.out.println("Creating stub");
		
		greetingServiceGrpc.greetingServiceBlockingStub syncStub = greetingServiceGrpc.newBlockingStub(channel);
		
		greetingResponse response = syncStub.greet(greetingRequest.newBuilder().setGreeting(greeting.newBuilder().setFirstName("balasubramaniam").setLastName("anbu").build()).build());
		
		System.out.println(response);
		
		channel.isShutdown();
	}

}
