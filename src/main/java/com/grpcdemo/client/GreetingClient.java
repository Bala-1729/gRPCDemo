package com.grpcdemo.client;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.proto.greet.greeting;
import com.proto.greet.greetingRequest;
import com.proto.greet.greetingResponse;
import com.proto.greet.greetingServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class GreetingClient {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Hello from grpc client");

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6666).usePlaintext().build();

		System.out.println("Creating stub");

		// unary response
//		greetingServiceGgreerpc.greetingServiceBlockingStub greetClient = greetingServiceGrpc.newBlockingStub(channel);
//
//		greeting greet = greeting.newBuilder().setFirstName("Balasubramaniam").setLastName("Anbu").build();
//
//		try {
//			greetingResponse response = greetClient.withDeadlineAfter(100, TimeUnit.MILLISECONDS)
//					.greet(greetingRequest.newBuilder().setGreeting(greet).build());
//			System.out.println(response.getResult());
//		} catch (StatusRuntimeException e) {
//			if (e.getStatus().getCode() == Status.Code.DEADLINE_EXCEEDED) {
//				System.out.println("Deadline exceeded");
//			}
//		}

		// server streaming
//		greetingServiceGrpc.greetingServiceBlockingStub greetClient = greetingServiceGrpc.newBlockingStub(channel);
//		
//		greeting greet = greeting.newBuilder()
//				.setFirstName("Balasubramaniam")
//				.setLastName("Anbu")
//				.build();
//		
//		greetingRequest request = greetingRequest.newBuilder().setGreeting(greet).build();
//		
//		greetClient.greetManyTimes(request).forEachRemaining((res) ->{
//			System.out.println(res.getResult());
//		});

		greetingServiceGrpc.greetingServiceStub greetClient = greetingServiceGrpc.newStub(channel);

		CountDownLatch latch = new CountDownLatch(1);

		// client streaming
		StreamObserver<greetingRequest> requestObserver = greetClient.longGreet(new StreamObserver<greetingResponse>() {

			@Override
			public void onNext(greetingResponse value) {	
				// TODO Auto-generated method stub
				//7 once the response is received by the client it executes the necessary operations
				System.out.println("Received a response from server");
				System.out.println(value.getResult());
			}

			@Override
			public void onError(Throwable t) {
				latch.countDown();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
				//9 once the server is done sending responses it calls this method
				System.out.println("Server completed sending response");
				latch.countDown();
			}

		}); // 1 calls the server by sending a responseObserver (athavathu ithoda object uh server ku tharuthu)

		// Bi-directional Streaming

//		StreamObserver<greetingRequest> responseObserver = greetClient.greetEveryone(new StreamObserver<greetingResponse>() {
//
//			@Override
//			public void onNext(greetingResponse value) {
//				// TODO Auto-generated method stub
//				System.out.println("Received a response from server");
//				System.out.println(value.getResult());
//			}
//
//			@Override
//			public void onError(Throwable t) {
//				latch.countDown();
//			}
//
//			@Override
//			public void onCompleted() {
//				// TODO Auto-generated method stub
//				System.out.println("Server completed sending response");
//				latch.countDown();
//			}
//
//		});
//
		requestObserver.onNext(greetingRequest.newBuilder()
				.setGreeting(greeting.newBuilder().setFirstName("Balasubramaniam").setLastName("Anbu").build())
				.build());

		requestObserver.onNext(greetingRequest.newBuilder()
				.setGreeting(greeting.newBuilder().setFirstName("Siddharth").setLastName("K C").build()).build());

		requestObserver.onNext(greetingRequest.newBuilder()
				.setGreeting(greeting.newBuilder().setFirstName("Harilal").setLastName("S K").build()).build());

		requestObserver.onNext(greetingRequest.newBuilder()
				.setGreeting(greeting.newBuilder().setFirstName("Ashwin").setLastName("Kallapiran").build()).build());
		
		//3 streaming a series of requests to the server using the object returned by the server
		
		requestObserver.onCompleted();
		
		//5 once the streaming is done and the client is ready to get the response it says to the server that the request is complete so so that it can put the response in the responseObserver sent by the client initially

		try {
			latch.await(20, TimeUnit.SECONDS);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("Shutting down channel");

		channel.shutdown();
	}

}
