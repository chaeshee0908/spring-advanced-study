package hello.advanced.trace;

public class TraceStatus {  // 로그 시작할때 상태 정보

    private TraceId traceId;
    private Long startTimeMs;   // 로그 시작 시간
    private String message; // 시작 시 사용한 메세지

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }
}
