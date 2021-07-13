package com.grpcdemo.server;

import com.proto.sum.SumRequest;
import com.proto.sum.SumResponse;
import com.proto.sum.SumServiceGrpc.SumServiceImplBase;

import io.grpc.stub.StreamObserver;

public class SumServiceImpl extends SumServiceImplBase{

	@Override
	public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
		System.out.println("Request received from "+request.getClass().getName());
		
		int sum = request.getValues().getNum1()+request.getValues().getNum2();
		
		SumResponse response = SumResponse.newBuilder().setSum(sum).build();
		
		responseObserver.onNext(response);
		
		responseObserver.onCompleted();
	}
		
}
