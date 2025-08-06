package org.example.이론;

/*
 * ===== JDBC 개요 =====
 * : Java DataBase Connectivity
 * : 자바에서 DB에 접근하기 위해(연결하기 위해) 제공되는 표준 API
 *
 * " Java 애플리케이션 -> SQL 실행 -> DB 결과를 받아오기 "
 * - MySQL, Oracle, MariaDB 등 다양한 DB와 Java를 연동
 * - 데이터베이스와 '연결, 질의, 결과, 종료'를 담당
 *
 * 1) JDBC의 역할
 * : DB에 접속하고, SQL문을 작성하고 전송, SQL 결과를 Java의 객체 형태로 받아옴, DB 연결 종료 및 자원 해제
 *
 * 2) JDBC의 필요성
 * : Java에서는 SQL문장을 직접 실행 X
 * - DB 드라이버와 JDBC API를 통해 DB와 연결
 * - Java에서 표준화된 SQL을 사용하여 DBMS의 유연성을 확보 (유지보수, 효율성)
 *     >> 통합된 표준 인터페이스 제공
 *
 * 3) JDBC 학습 목적
 * : Spring Boot는 내부적으로 JDBC를 기반으로 동작
 * - DB 연결이 어떻게 이루어지는지?
 * - SQL이 어디서 실행되는지?

 * 4) JDBC 동작 흐름
 * [Java Application] >> [JDBC Driver 로딩] >> [DB 연결(Connection 생성)]
 * >> [SQL 작성 및 실행] >> [결과 처리(ResultSet)] >> [자원 해제(Connection, Statement, ResultSet close)]
 *
 * 5) JDBC 주요 클래스
 *   a) DriverManager
 *       : JDBC 드라이버 로딩 및 DB 연결을 담당
 *   b) Connection
 *       : DB와 연결된 상태를 표현하는 객체
 *   c) Statement
 *       : SQL 실행을 위한 객체 (정적 SQL에 사용)
 *   d) PreparedStatement
 *       : ? 파라미터를 사용할 수 있는 객체 (동적 SQL에 사용)
 *   e) ResultSet
 *       : SELECT 결과값을 담는 객체 (조회 결과를 처리)
 *
 * 6) JDBC 장단점
 *   a) 장점
 *       : Java만으로 DB 연동 가능
 *       - 다양한 DBMS를 지원
 *       - 직접적인 SQL 작성 가능: 세세한 데이터 조회가 가능
 *   b) 단점
 *       : SQL 코드에 직접 작성 >> 유지보수 어려움
 *       : 반복 코드가 많음 (연결, 해제의 반복)
 *       - 객체지향 설계가 어려움 (테이블 = 객체 구조가 아님)
 *       >> 해당 단점을 보완하여 JPA, MyBatis를 학습
 * */

public class Jdbc01 {
}
