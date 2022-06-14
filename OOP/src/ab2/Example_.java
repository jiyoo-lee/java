package ab2;

public class Example_ {

	public static void main(String[] args) {
		
		Home h[] = { new Computer(), new Monitor() }; //interface 기준 
		Home2 h2[] = { new Phone() }; //extends로 Home을 로드하였음.
		h[0].broken(0);
		h2[0].broken(0);
		
		/*
		Phone ph = new Phone(); //인터페이스 추가시에는 객체 새로 생성해야함
		ph.broken(30);
		*/
		
		
		//h[0].broken(40);
		//h[1].broken(0);
		//h[2].broken(9);

	}

}

class Computer implements Home {
	
	@Override
	public void powerOn() {
		System.out.println("컴퓨터 전원 공급 중...");
		
	}
	
	@Override
	public void powerOff() {
		System.out.println("전원 중단!");
		
	}
	
	@Override
	public void broken(int a) {
		if(this.bk <= a ) {
			System.out.println("컴퓨터 고장!");
		}
		else if(this.bk > a && a > 0) {
			this.powerOn();
		}
		else {
			this.powerOff();
		}
	}
	
}


class Monitor implements Home {
	@Override
	public void powerOn() {
		System.out.println("모니터 전원 공급 중...");
	}
	@Override
	public void powerOff() {
		System.out.println("전원 중단!");
	}
	@Override
	public void broken(int a) {
		if(this.bk <= a ) {
			System.out.println("모니터 고장!");
		}
		else if(this.bk > a && a > 0) {
			this.powerOn();
		}
		else {
			this.powerOff();
		}
	}
}


//응용문제 휴대폰에 추가 기능이 필요합니다.
// 휴대폰 고장시 최소전원(20)을 넣었을때 -> 정상작동은 40이상
//1.화면 전원은 공급되지만 화면이 고장날 경우 (공급중이지만 작동이 안되는 경우) 20 미만
//2. 전원을 공급시키지만 충전이 안될경우 (공급이 안되는 경우) 20 ~39까지 

class Phone implements Home, Home2 { 
	
	@Override
	public void powerOn() {
		System.out.println("휴대폰 전원 공급 중...");
	}
	
	@Override
	public void powerOff() {
		System.out.println("전원 중단!");
	
	}
	@Override
	public void phoneNotCharge() { // 20미만
		System.out.println("충전이 되지않습니다.");
	}
	
	@Override
	public void phoneMonitorBroken() { // 20~39까지
		System.out.println("화면이 고장났습니다.");
	}
	
	
	
	@Override
	public void broken(int a) {
		if(this.bk <= a ) { 		// 80이상일때
			System.out.println("휴대폰 고장!");
		}
		else if(this.bk > a && a >= 40) { 	// 80보다 작지만 40 이상일때 (정상 작동)
			this.powerOn();
		}
		
		else if(a <= 39 && a >= 20) { // 20 이상 39 이하 (충전이 되지않음)
				this.phoneMonitorBroken();
			}
		
		else if(a < 20 && a > 0) { // 0보다 크고 20보다 작을때 (화면이 고장났음)
				this.phoneNotCharge();
			}
		
		else {
				this.powerOff(); // 0일때 (전원이 꺼짐)
			}
	}
	
}
