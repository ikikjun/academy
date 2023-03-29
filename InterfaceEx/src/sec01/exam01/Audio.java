package sec01.exam01;


// 여러개의 인터페이스를 구현 할 수 있다
// 인터페이스들에 선언된 추상 메서드를 모두 구현 해야 한다
// 미구현 메소드가 남아 있다면 추상클래스가 된다
public class Audio implements RemoteControl, Searchable {

	private int volume;
	@Override
	public void turnOn() {
			System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnOff() {
			System.out.println("오디오를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// 인터페이스의 상수값을 이용해서 volume 필드의 값을 제한
//		this.volume = volume; else 를 사용하고자 하지 않을때는 맨 위에 올리면 괜찮다
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME){
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}

}
