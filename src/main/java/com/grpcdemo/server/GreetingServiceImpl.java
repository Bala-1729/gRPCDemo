package com.grpcdemo.server;

import com.proto.greet.greetingRequest;
import com.proto.greet.greetingResponse;
import com.proto.greet.greetingServiceGrpc.greetingServiceImplBase;

import io.grpc.Context;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends greetingServiceImplBase{

	@Override
	public void greet(greetingRequest request, StreamObserver<greetingResponse> responseObserver) {
		
		System.out.println("Request received from "+request.getClass().getName());
		
		Context context = Context.current();
		try {
			for(int i=0;i<3;i++) {
				if(!context.isCancelled()) {
					Thread.sleep(100);
				}else {
					break;
				}
			}
			
			String result = "Hi there "+request.getGreeting().getFirstName()+" "+request.getGreeting().getLastName();
			
			greetingResponse response = greetingResponse.newBuilder().setResult(result).build();
			
			responseObserver.onNext(response);
			
			responseObserver.onCompleted();
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	@Override
	public void greetManyTimes(greetingRequest request, StreamObserver<greetingResponse> responseObserver) {
		System.out.println("Request received from "+request.getClass().getName());
		
		try {
			for(int i=0;i<10;i++) {
				String result = "Hi there "+request.getGreeting().getFirstName()+" "+request.getGreeting().getLastName();
				greetingResponse response = greetingResponse.newBuilder().setResult(result).build();
				responseObserver.onNext(response);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		finally {
			responseObserver.onCompleted();
		}
	}

	@Override
	public StreamObserver<greetingRequest> longGreet(StreamObserver<greetingResponse> responseObserver) {
	
		StreamObserver<greetingRequest> requestObserver = new StreamObserver<greetingRequest>() {

			String result = "";
			
			@Override
			public void onNext(greetingRequest value) {
				//when the client sends a request
				result += value.getGreeting().getFirstName()+" "+value.getGreeting().getLastName()+"!\n";
				//4 for each and every request done by the client this method will be executed but the response will not be returned as this is a client streaming meachanism
			}

			@Override
			public void onError(Throwable t) {
				//when the client sends a error
			}

			@Override
			public void onCompleted() {
				//when the client is done sending	
				//6 the server after completing the operations it puts the data into the responseObserver object
				responseObserver.onNext(greetingResponse.newBuilder().setResult(result).build());
				
				//8 finally the server says that it is done sending responses
				responseObserver.onCompleted();
			}
			
		};
		return requestObserver; //2 once the RPC call is done the server will return this to the client (athavathu ithoda object uh client ku tharuthu)
	}

	@Override
	public StreamObserver<greetingRequest> greetEveryone(StreamObserver<greetingResponse> responseObserver) {
		
		StreamObserver<greetingRequest> requestObserver = new StreamObserver<greetingRequest>() {

			@Override
			public void onNext(greetingRequest value) {
				String result = "Hello "+value.getGreeting().getFirstName()+" "+value.getGreeting().getLastName()+"!\n";
				greetingResponse response = greetingResponse.newBuilder().setResult(result).build();
				responseObserver.onNext(response);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				responseObserver.onCompleted();
			}
			
		};
		
		return requestObserver;
	}
	
	
	
	
}
