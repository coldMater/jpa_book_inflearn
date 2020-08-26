package com.coldmater.jpa_book_younghan.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="ORDERS") //DB 에 ORDER 가 예약어인 경우가 있다. 아 회사에서도 이렇게 할걸...
public class Order {
    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    private LocalDateTime orderDate; //JAVA 8부터 생긴듯(이 타입은 하이버네이트가 자동으로 해준다.)

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
