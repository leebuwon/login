package hello.login.domain.item;

import lombok.Data;

// 도메인이 가장 중요하다.
// 도메인 = 화면, UI, 기술 인프라 등등의 영역은 제외한 시스템이 구현해야 하는 핵심 비즈니스 업무 영역을 말함
// web은 도메인에 의존하도록 하지만 도메인은 web에 의존하면 안된다.
// 의존 관계를 단방향으로 설정하는게 잘하는 것이다.


@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}