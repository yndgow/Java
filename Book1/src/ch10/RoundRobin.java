package ch10;

// 상담원 한명씩 돌아가면 동일하게 상담 업무 배분
public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}
