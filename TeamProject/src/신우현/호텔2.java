package 신우현;

public class 호텔2 extends 호텔Total {

	@Override
	public void 예약등록(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("호텔2 / 스위트룸 예약 완료");
				room[hotelch-1][roomch-1] = 1;
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("호텔2 / 디럭스룸 예약 완료");
				room[hotelch-1][roomch-1] = 1;
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("호텔2 / 스탠다드룸 예약 완료");
				room[hotelch-1][roomch-1] = 1;
			}
		}
	}
	@Override
	public void 예약취소(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("호텔2 / 스위트룸 예약취소 완료");
				room[hotelch-1][roomch-1] = 0;
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("호텔2 / 디럭스룸 예약취소 완료");
				room[hotelch-1][roomch-1] = 0;
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("호텔2 / 스탠다드룸 예약취소 완료");
				room[hotelch-1][roomch-1] = 0;
			}
		}
	}
	@Override
	public void 본인예약조회() {
		System.out.println("호텔 2 본인예약조회");
	}
	@Override
	public void 전체예약현황() {
		System.out.print("호텔 2\t");
		for (int i = 0; i < 3; i++) {
			if (room[1][i] == 0)
				System.out.print("□\t");
			if (room[1][i] == 1)
				System.out.print("■\t");
		}
		System.out.println();
	}
	@Override
	public void 파일처리() {
		System.out.println("호텔 2 파일처리");
	}
	
}
