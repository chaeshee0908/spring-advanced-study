package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service    // component 스캔의 대상이 되며 자동으로 Bean 등록
@RequiredArgsConstructor    // 생성자 자동으로 lombok이 만들어줌 (의존관계 자동 주입)
public class OrderServiceV0 {

    private final OrderRepositoryV0 orderRepository;

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
