package org.example.이론;

/*
    === SQL 실행 및 결과 처리 ===
    1. Connection 객체 생성
    2. SQL 문 준비(SELECT, INSERT 등)
    3. Statement, PrepareStatement 객체 생성 - SQL 실행 객체 생성
    4. SQL 실행 (executeQuery, executeUpdate)
    5. 결과 처리(ResultSet 또는 자원 해제)

    === Statement VS PrepareStatement ===
    1) SQL 작성 방법
    - Statement: SQL 직접 작성
    - PrepareStatement: ? 를 사용하여 파라미터 처리

    2) 보안
    - Statement: SQL Injection 위험이 있음 (메서드: createStatement)
    - PreparedStatement: SQL Injection 방지 (메서드: prepareStatement)

    cf) SQL Injection: 악의적인 SQL문 실행 (SQL 쿼리를 일반 입력 또는 양식 필드에 삽입하는 보안 취약성 공격)

    3) 성능
    - Statement: 매번 컴파일
    - PrepareStatement: 사전 컴파일 >> 속도가 더 빠름

    === executeQuery VS executeUpdate ===
    1) executeQuery
    : SELECT 문 실행시 사용
    - 쿼리 실행후 결과를 ResultSet 객체로 반환
    - ResultSet 내부에서 데이터 추출

    >> ResultSet 결과 처리 방법
        - rs.next(): 다음 행 존재 여부 확인 및 이동
        - rs.getInt("컬렴명"), rs.getString("컬럼명"), rs.getDate("컬럼명")
            : 정수값, 문자열값, 날짜값 추출

    2) executeUpdate
    : INSERT, UPDATE, DELETE 문 실행시 사용 - 실행 결과로 영향받은 레코드 수를 반환
    - 반환 타입 INT
    - 행의 개수를 반환하기 때문에 rs(ResultSet) 사용 필요 없음

 */
public class Jdbc03 {

}
