package org.example.이론;

import java.sql.*;

public class First {
    public static void main(String[] args) {
        // 1. DB 접속 정보
        // >> JDBC 프로토콜
        //      - jdbc:사용하는DBMS://서버주소:포트번호/DB명
        // jdbc:mysql://localhost:3306/k3_iot_jdbc

        final String URL = "jdbc:mysql://localhost:3306/k3_iot_jdbc";
        String user = "root";
        String password = "root";

        Connection conn = null; // DB 연결 객체
        Statement stmt = null; // DB 실행 객체
        PreparedStatement pstmt = null; // 동적 DB 실행 객체
        ResultSet rs = null; // DB 결과 객체

        try {
            // 1. 드라이버 로딩
            // : JDBC 드라이버 클래스를 메모리에 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. DB 연결
            // : 실제 MySQL DB에 접속 시도 (성공하면 Connection 객체를 반환)
            conn = DriverManager.getConnection(URL, user, password);
            System.out.println("DB 연결 성공");

            // === DB 데이터 CRUD ===

            // 1) DB 데이터 삽입 (INSERT)
//            String sql = "INSERT INTO members (name, email) VALUES (?, ?)";
//            pstmt = conn.prepareStatement(sql); // 동적 데이터 값은 set 설정 함수로 지정
//
//            pstmt.setString(1, "조승범");
//            pstmt.setString(2, "zzx123@example.com");
//
//            int result = pstmt.executeUpdate(); // INSERT 실행 - 반환은 영향 받은 행의 수
//            System.out.println(result + "명 회원이 추가됨");

            // 2) DB 데이터 조회 (READ - 전체 조회)
//            String sql = "SELECT * FROM members";
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery(sql); // SELECT 실행 - 반환은 ResultSet 객체
//
//            while(rs.next()) { // 다음 행 존재 여부 확인
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//
//                System.out.println("id: " + id + ", name: " + name + ", email:" + email);
//            }

            // 3) DB 데이터 조회(단건조회)
//            String sql = "SELECT * FROM members WHERE id = ?";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(1, 1); // 동적파라미터의 위치값은 1부터 시작
//           // pstmt.setInt(1, 10);  -> 해당 ID 의 회원이 없습니다.
//            rs = pstmt.executeQuery();
//
//            if(rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//
//                System.out.println("id: " + id + ", name: " + name + ", email:" + email);
//            } else {
//                System.out.println("해당 ID 의 회원이 없습니다.");
//            }

            // 4) DB 데이터 수정 (UPDATE)
//            String sql = "UPDATE members SET email = ? WHERE id = ?";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, "new@naver.com");
//            pstmt.setInt(2, 1);
//
//            int updatedResult = pstmt.executeUpdate(); // 반환은 영향 받은 행의 수
//            System.out.println(updatedResult + "명 수정됨");

            // 5) DB 데이터 삭제(DELETE)
            String sql = "DELETE FROM members WHERE id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1);
            int deletedResult = pstmt.executeUpdate();
            System.out.println(deletedResult + "명 삭제됨");


        } catch (Exception e) {
            System.out.println("DB 와의 커넥션 중 예외 발생");
            e.printStackTrace(); // - 예외발생시 예외 메시지 + 호출 스택 정보 출력(예외 발생지 출력)
        } finally {
            // 자원 해제 (자바 7버전 이상 부터 자동 자원 해제 됨) >>  아래 구문들 생략 가능

            try {
                if(conn != null && stmt != null && rs != null) {
                    // DB connection 이 모두 존재한다면
                    stmt.close();
                    rs.close();
                    conn.close();
                    System.out.println("DB 연결 종료");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
