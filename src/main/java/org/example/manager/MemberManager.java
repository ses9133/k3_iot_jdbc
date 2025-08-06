package org.example.manager;

import org.example.dao.MemberDao;
import org.example.db.entity.Member;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MemberManager {
    public void run() throws SQLException {
        Scanner sc = new Scanner(System.in);
        MemberDao memberDao = new MemberDao();

        while(true) {
            System.out.println("1. 사용자 추가");
            System.out.println("2. 사용자 전체 조회");
            System.out.println("3. 사용자 단건 조회");
            System.out.println("4. 사용자 정보 수정");
            System.out.println("5. 사용자 삭제");
            System.out.println("6. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요 >> ");

            String selected = sc.nextLine();

            switch (selected) {
                case "1":
                    addMember(sc, memberDao);
                    break;
                case "2":
                    viewAllMembers(memberDao);
                    break;
                case "3":
                    viewMemberById(sc, memberDao);
                     break;
                case "4":
                    updateMember(sc, memberDao);
                    break;
                case "5":
                    deleteMember(sc, memberDao);
                    break;
                case "6":
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요");
                    break;
            }
        }
    }


    // 1. 사용자 추가
    private void addMember(Scanner sc, MemberDao dao) throws SQLException {
        System.out.println("새로운 사용자 이름 입력: ");
        String name = sc.nextLine();

        System.out.println("새로운 이메일 이름 입력: ");
        String email = sc.nextLine();

        // cf) DB의 AUTO_INCREMENT 값으로 -1 을 전달하면
        //  : 아직 DB 에 저장되지 않음을 의미하는 값

        Member newMember = new Member(-1, name, email);

        dao.addMember(newMember);
        System.out.println("사용자가 성공적으로 추가되었습니다.");
    }
    // 2. 사용자 전체 조회
    private void viewAllMembers(MemberDao dao) throws SQLException {
        List<Member> members = dao.findAll();

        if(members.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다...");
        }  else {
            members.forEach(System.out::println);
        }
    }

    // 3. 사용자 단건 조회
    private void viewMemberById(Scanner sc, MemberDao dao) throws SQLException {
        System.out.println("조회할 사용자 ID 입력: ");
        int id = Integer.parseInt(sc.nextLine());

        Member member = dao.getMemberById(id);

        if(member != null) {
            System.out.println(member);
        } else {
            System.out.println("해당 아이디의 사용자를 찾을 수 없습니다...");
        }
    }

    // 4, 사용자 수정
    private void updateMember(Scanner sc, MemberDao dao) throws SQLException {
        System.out.println("수정할 사용자 ID 입력: ");
        int id = Integer.parseInt(sc.nextLine());

        Member member =dao.getMemberById(id);

        if(member == null) {
            System.out.println("해당 아이디의 사용자를 찾을 수 없습니다...");
            return;
        }

        System.out.println("사용자의 새 이름(변경하지 않으려면 Enter)");
        String newName = sc.nextLine();
        System.out.println("사용자의 새 이메일(변경하지 않으려면 Enter");
        String newEmail = sc.nextLine();

        if(!newName.isEmpty()) {
            member.setName(newName);
        }

        if(!newEmail.isEmpty()) {
            member.setEmail(newEmail);
        }

        if(newName.isEmpty() && newEmail.isEmpty()) {
            System.out.println("변경값이 없습니다. 수정이 불가능합니다.");
            return;
        }

        dao.updateMember(member);
        System.out.println("사용자 정보가 성공적으로 업데이트되었습니다.");
    }

    // 5, 사용자 삭제
    private void deleteMember(Scanner sc, MemberDao dao) throws SQLException {
        System.out.println("삭제할 사용자 ID 입력: ");
        int id = Integer.parseInt(sc.nextLine());

        Member member =dao.getMemberById(id);

        if(member == null) {
            System.out.println("해당 아이디의 사용자를 찾을 수 없습니다...");
            return;
        }

        dao.deleteMember(id);
        System.out.println("성공적으로 삭제되었습니다.");
    }
}
