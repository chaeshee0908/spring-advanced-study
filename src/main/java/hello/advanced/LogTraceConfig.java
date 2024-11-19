package hello.advanced;

import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    // 수동 등록(singleton)
    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
