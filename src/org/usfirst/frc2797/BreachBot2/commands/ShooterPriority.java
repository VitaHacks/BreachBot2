package org.usfirst.frc2797.BreachBot2.commands;

import org.usfirst.frc2797.BreachBot2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterPriority extends Command {

	public boolean isController1;

	public ShooterPriority(boolean isController1) {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.shooter);
		this.isController1 = isController1;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (isController1) {
			Robot.oi.shooterPri = false;
		} else {
			Robot.oi.shooterPri = true;
		}

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
