package TV;
public class Television {
	private int channel;
	private int volume;
	private boolean poweron;
	
	public Television() {
		 channel=3;
		volume=50;
		poweron=false;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPowerOn() {
		return poweron;
	}
	public boolean setChannel(int choosechannel) {
		boolean changed=false;
		if(choosechannel<=200 && choosechannel>0) {
			channel=choosechannel;
			changed=true;
		}
		return changed;
	}
	public void power() {
		poweron=!poweron;
	}
	public int increaseVolume() {
		if(volume<100) {
			volume=volume+1;
		}
		return volume;
	}
	public int decreaseVolume() {
		if(volume>0) {
			volume=volume-1;
		}
		return volume;
	}
}
