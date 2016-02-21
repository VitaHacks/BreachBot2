package org.usfirst.frc2797.BreachBot2;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

public class POVButton extends Button {

	Joystick joystick;
	int leftpress;

	public POVButton(Joystick joystick) {
		this.joystick = joystick;
	}

	@Override
	public boolean get() {

		return false;
	}

}
