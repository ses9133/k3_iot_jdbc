package org.example.db.entity;

// Entity: DB 테이블과 1:1 매핑되는 클래스

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
// : JDBC 또는 ORM (DB 와 Java 를 객체화하여 연동하는 체계) 에서는
//  , 빈 객체를 먼저 만들고 setter 로 값을 넣는 방식 사용
//  >> AllArgsConstructor 도 NoArgsConstructor 가 전제되어야함
@Getter
@Setter
@ToString
public class Member {
    private int id;
    private String name;
    private String email;
}
