package TV;

import java.util.Scanner;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("Enter your option.....");
			System.out.println("1. Switch");
			System.out.println("2. Increase Volume");
			System.out.println("3. Decrease Volume");
			System.out.println("4. Change Channels");
			System.out.println("5. Current State Information");
			System.out.println("6. Exit");
			option = sc.nextInt();
			switch (option) {
			case 1:
				tv.power();
				System.out.println("State changed");
				break;
			case 2:
				int volumeIncreased = tv.increaseVolume();
				System.out.println("Volume increased to " + volumeIncreased);
				break;
			case 3:
				int volumeDecreased = tv.decreaseVolume();
				System.out.println("Volume increased to " + volumeDecreased);
				break;
			case 4:
				System.out.println("Input channel....");
				int choosechannel = sc.nextInt();
				boolean changed = tv.setChannel(choosechannel);
				if (changed)
					System.out.println("Channel changed to " + choosechannel);
				else
					System.out.println("Invalid Input");
				break;
			case 5:
				boolean state = tv.isPowerOn();
				int volumeState = tv.getVolume();
				int channelState = tv.getChannel();
				String power;
				if (state) {
					power = "on";
				} else
					power = "off";
				System.out.println("Power:" + power);
				System.out.println("channel" + channelState);
				System.out.println("Volume" + volumeState);
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}

		} while (option != 6);
		sc.close();
	}
}
