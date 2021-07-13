package com.proto.greet;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: greet.proto")
public final class greetingServiceGrpc {

  private greetingServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.greetingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.greet.greetingRequest,
      com.proto.greet.greetingResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = com.proto.greet.greetingRequest.class,
      responseType = com.proto.greet.greetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greet.greetingRequest,
      com.proto.greet.greetingResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.greetingRequest, com.proto.greet.greetingResponse> getGreetMethod;
    if ((getGreetMethod = greetingServiceGrpc.getGreetMethod) == null) {
      synchronized (greetingServiceGrpc.class) {
        if ((getGreetMethod = greetingServiceGrpc.getGreetMethod) == null) {
          greetingServiceGrpc.getGreetMethod = getGreetMethod = 
              io.grpc.MethodDescriptor.<com.proto.greet.greetingRequest, com.proto.greet.greetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "greet.greetingService", "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.greetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.greetingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new greetingServiceMethodDescriptorSupplier("Greet"))
                  .build();
          }
        }
     }
     return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.greetingRequest,
      com.proto.greet.greetingResponse> getGreetManyTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetManyTimes",
      requestType = com.proto.greet.greetingRequest.class,
      responseType = com.proto.greet.greetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.greetingRequest,
      com.proto.greet.greetingResponse> getGreetManyTimesMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.greetingRequest, com.proto.greet.greetingResponse> getGreetManyTimesMethod;
    if ((getGreetManyTimesMethod = greetingServiceGrpc.getGreetManyTimesMethod) == null) {
      synchronized (greetingServiceGrpc.class) {
        if ((getGreetManyTimesMethod = greetingServiceGrpc.getGreetManyTimesMethod) == null) {
          greetingServiceGrpc.getGreetManyTimesMethod = getGreetManyTimesMethod = 
              io.grpc.MethodDescriptor.<com.proto.greet.greetingRequest, com.proto.greet.greetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "greet.greetingService", "GreetManyTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.greetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.greetingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new greetingServiceMethodDescriptorSupplier("GreetManyTimes"))
                  .build();
          }
        }
     }
     return getGreetManyTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.greetingRequest,
      com.proto.greet.greetingResponse> getLongGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongGreet",
      requestType = com.proto.greet.greetingRequest.class,
      responseType = com.proto.greet.greetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.greetingRequest,
      com.proto.greet.greetingResponse> getLongGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.greetingRequest, com.proto.greet.greetingResponse> getLongGreetMethod;
    if ((getLongGreetMethod = greetingServiceGrpc.getLongGreetMethod) == null) {
      synchronized (greetingServiceGrpc.class) {
        if ((getLongGreetMethod = greetingServiceGrpc.getLongGreetMethod) == null) {
          greetingServiceGrpc.getLongGreetMethod = getLongGreetMethod = 
              io.grpc.MethodDescriptor.<com.proto.greet.greetingRequest, com.proto.greet.greetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "greet.greetingService", "LongGreet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.greetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.greetingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new greetingServiceMethodDescriptorSupplier("LongGreet"))
                  .build();
          }
        }
     }
     return getLongGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.greetingRequest,
      com.proto.greet.greetingResponse> getGreetEveryoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetEveryone",
      requestType = com.proto.greet.greetingRequest.class,
      responseType = com.proto.greet.greetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.greetingRequest,
      com.proto.greet.greetingResponse> getGreetEveryoneMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.greetingRequest, com.proto.greet.greetingResponse> getGreetEveryoneMethod;
    if ((getGreetEveryoneMethod = greetingServiceGrpc.getGreetEveryoneMethod) == null) {
      synchronized (greetingServiceGrpc.class) {
        if ((getGreetEveryoneMethod = greetingServiceGrpc.getGreetEveryoneMethod) == null) {
          greetingServiceGrpc.getGreetEveryoneMethod = getGreetEveryoneMethod = 
              io.grpc.MethodDescriptor.<com.proto.greet.greetingRequest, com.proto.greet.greetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "greet.greetingService", "GreetEveryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.greetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.greetingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new greetingServiceMethodDescriptorSupplier("GreetEveryone"))
                  .build();
          }
        }
     }
     return getGreetEveryoneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static greetingServiceStub newStub(io.grpc.Channel channel) {
    return new greetingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static greetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new greetingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static greetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new greetingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class greetingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void greet(com.proto.greet.greetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void greetManyTimes(com.proto.greet.greetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetManyTimesMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.greetingRequest> longGreet(
        io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLongGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Bi-directional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.greetingRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetEveryoneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.greet.greetingRequest,
                com.proto.greet.greetingResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyTimesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.greet.greetingRequest,
                com.proto.greet.greetingResponse>(
                  this, METHODID_GREET_MANY_TIMES)))
          .addMethod(
            getLongGreetMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.greet.greetingRequest,
                com.proto.greet.greetingResponse>(
                  this, METHODID_LONG_GREET)))
          .addMethod(
            getGreetEveryoneMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.greet.greetingRequest,
                com.proto.greet.greetingResponse>(
                  this, METHODID_GREET_EVERYONE)))
          .build();
    }
  }

  /**
   */
  public static final class greetingServiceStub extends io.grpc.stub.AbstractStub<greetingServiceStub> {
    private greetingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private greetingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected greetingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new greetingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void greet(com.proto.greet.greetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void greetManyTimes(com.proto.greet.greetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGreetManyTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.greetingRequest> longGreet(
        io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLongGreetMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Bi-directional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.greetingRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGreetEveryoneMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class greetingServiceBlockingStub extends io.grpc.stub.AbstractStub<greetingServiceBlockingStub> {
    private greetingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private greetingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected greetingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new greetingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.proto.greet.greetingResponse greet(com.proto.greet.greetingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<com.proto.greet.greetingResponse> greetManyTimes(
        com.proto.greet.greetingRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGreetManyTimesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class greetingServiceFutureStub extends io.grpc.stub.AbstractStub<greetingServiceFutureStub> {
    private greetingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private greetingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected greetingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new greetingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greet.greetingResponse> greet(
        com.proto.greet.greetingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY_TIMES = 1;
  private static final int METHODID_LONG_GREET = 2;
  private static final int METHODID_GREET_EVERYONE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final greetingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(greetingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.proto.greet.greetingRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY_TIMES:
          serviceImpl.greetManyTimes((com.proto.greet.greetingRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LONG_GREET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longGreet(
              (io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse>) responseObserver);
        case METHODID_GREET_EVERYONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetEveryone(
              (io.grpc.stub.StreamObserver<com.proto.greet.greetingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class greetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    greetingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.greet.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("greetingService");
    }
  }

  private static final class greetingServiceFileDescriptorSupplier
      extends greetingServiceBaseDescriptorSupplier {
    greetingServiceFileDescriptorSupplier() {}
  }

  private static final class greetingServiceMethodDescriptorSupplier
      extends greetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    greetingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (greetingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new greetingServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetManyTimesMethod())
              .addMethod(getLongGreetMethod())
              .addMethod(getGreetEveryoneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
