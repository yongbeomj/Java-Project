package 신우현;

import java.util.ArrayList;
import java.util.Vector;

public class MemberController {

	private static final Object h_id = null;
	// 1. 필드 [ 모든 회원을 담고 있는 객체 = 컬렉션 프레임워크 vs 배열 ]
	public static Vector<Member> memberlist = new Vector<>();

	// 2. 메소드

	// 1. 회원가입
	public static boolean signup(Member member) {
		// 반환타입 :
		// 1. 유효성검사
		if (member.getH_id().length() < 4) {
			System.err.println(" [알림] : ID는 4글자이상 가능 합니다. ");
			return false;
		}
		if (member.getH_id().equals("admin")) {
			System.err.println(" 사용할 수 없는 아이디입니다. ");
			return false;
		}
		if (member.getH_pw().length() != 4) {
			System.err.println(" [알림] : Password는 4글자만 입니다. ");
			return false;
		}
		if (member.getH_name().length() < 2) {
			System.err.println(" [알림] : Name는 2글자이상 가능 입니다. ");
			return false;
		}

		// 2. ID 중복체크 [ 리스트내 동일한 아이디가 있는지 확인 ]
		for (Member temp : memberlist) {
			if (temp.getH_id().equals(member.getH_id())) {
				System.err.println(" [알림] : 이미 사용 중인 아이디 입니다. ");
				return false;
			}
		}

		// 3. 리스트 저장
		memberlist.add(member);

		File.filesave(1);

		return true; // 회원가입 성공시

	}

	// 2. 로그인
	public static boolean login(String h_id, String h_pw) {

		for (Member member : memberlist) {
			if (h_id.equals("admin")) {
				System.err.println(" 사용할 수 없는 아이디입니다. ");
				return false;
			} else if (member.getH_id().equals(h_id) && member.getH_pw().equals(h_pw)) {
				return true; // 로그인 성공시
			}
		}
		return false; // 로그인 실패시
	}
}
