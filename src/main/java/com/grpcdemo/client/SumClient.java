package com.grpcdemo.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.proto.sum.*;

public class SumClient {

	public static void main(String[] args) {
		System.out.println("Hello from sum client");
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6666)
				.usePlaintext()
				.build();
		
		System.out.println("Creating stub");
		
		SumServiceGrpc.SumServiceBlockingStub sumClient = SumServiceGrpc.newBlockingStub(channel);
		
		InputValues input = InputValues.newBuilder().setNum1(10).setNum2(20).build();
		
		SumRequest request = SumRequest.newBuilder().setValues(input).build();
		
		SumResponse response = sumClient.sum(request);
		
		System.out.println(response.getSum());
		
		System.out.println("Shutting down channel");

		channel.shutdown();
		
	}

}
