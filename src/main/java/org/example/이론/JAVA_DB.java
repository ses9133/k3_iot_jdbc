package org.example.이론;

/*
    === JDBC VS JPA VS MyBatis ==
    : Java(Spring Boot) 에서 DB 와 연동하기 위한 방법

    1) JDBC (JDBC API 기반)
        : Java 에서 DB 에 접근 할 수 있또록 표준으로 제공하는 표준 API
        - SQL 문을 문자열로 작성
        >> Connection, PreparedStatement, ResultSet 등의 객체를 통해 직접 DB 와 통신

        cf) Spring JDBC - 기존의 JDBC 를 간소화 하는 JDBC 추상화 라이브러리 (스프링 제공)

    2) JPA (ORM, Object Relational Mapping 기반)
        : Java Persistence API
        : 자바 객체와 DB 테이블 간의 매핑을 지원하는 ORM 기술 표본
        - SQL 을 직접 작성하지 않고, 자바 코드만으로 DB 연동이 가능
        - SpringBoot 에서는 주로 Hibernate 를 JPA 구현체로 사용

        장점) SQL 작성이 거의 필요없음, '객체 중심의 개발 가능', 유지보수가 쉽고 비즈니스 로직에 집중 가능...
        단점) 성능 튜닝 어려움 (Hibernate 의 동작 이해 필요), 복잡한 코드 작성시 - JPQL, QueryDSL 사용 필요

    3) MyBatis (SQL Mapper 기반)
        : SQL 을 XML 또는 어노테이션을 관리할 수 있는 SQLMapper 프레임 워크
        - JDBC 처럼 SQL 을 직접 작성 - 객체 매핑을 도와줌

        장점) SQL 작성 자유도 높음, 복잡한 쿼리 작성에 유리
        단점) SQL 과 자바코드가 분리 되어있음. > 유지 보수가 어렵고 중복 가능성 존재, 코드량이 많아짐
 */

// SpringBoot 프로젝트에서 사용 방법
// 1. 객체 중심 설계, 유지보수가 편한 구조 : JPA
// 2. 복잡한 조인이 많이 들어가고, 서브쿼리가 많고 SQL 제어가 중요한 경우: MyBatis

public class JAVA_DB {
}
