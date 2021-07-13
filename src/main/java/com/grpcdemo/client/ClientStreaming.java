package com.grpcdemo.client;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.proto.greet.greeting;
import com.proto.greet.greetingRequest;
import com.proto.greet.greetingResponse;
import com.proto.greet.greetingServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ClientStreaming {

	public static void main(String[] args) {
		System.out.println("Hello from grpc client - client streaming");

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6666).usePlaintext().build();

		System.out.println("Creating stub");
		
		greetingServiceGrpc.greetingServiceStub stub = greetingServiceGrpc.newStub(channel);
		
		CountDownLatch latch = new CountDownLatch(1);
		
		StreamObserver<greetingResponse> responseObserver = new StreamObserver<greetingResponse>() {

			@Override
			public void onNext(greetingResponse value) {
				// TODO Auto-generated method stub
				System.out.println("Response received from server");
				System.out.println(value.getResult());
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				latch.countDown();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Server completed sending responses");
				latch.countDown();
			}
			
		};
		
		StreamObserver<greetingRequest> requestObserver = stub.longGreet(responseObserver);
		
		requestObserver.onNext(greetingRequest.newBuilder()
				.setGreeting(greeting.newBuilder().setFirstName("Balasubramaniam").setLastName("Anbu").build())
				.build());

		requestObserver.onNext(greetingRequest.newBuilder()
				.setGreeting(greeting.newBuilder().setFirstName("Siddharth").setLastName("K C").build()).build());

		requestObserver.onNext(greetingRequest.newBuilder()
				.setGreeting(greeting.newBuilder().setFirstName("Harilal").setLastName("S K").build()).build());

		requestObserver.onNext(greetingRequest.newBuilder()
				.setGreeting(greeting.newBuilder().setFirstName("Ashwin").setLastName("Kallapiran").build()).build());
		
		requestObserver.onCompleted();
		
		try {
			latch.await(3, TimeUnit.SECONDS);
		}
		catch(InterruptedException ie) {ie.printStackTrace();}
		
		System.out.println("Shutting down channel");

		channel.shutdown();
	}

}
