package org.usfirst.frc2797.BreachBot2.commands;

import org.usfirst.frc2797.BreachBot2.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RaiseShooter extends Command {
	
	Joystick joystick;
	boolean shooterPri;

    public RaiseShooter(Joystick joystick, boolean shooterPri) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shooter);
    	this.joystick = joystick;
    	this.shooterPri = shooterPri;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (shooterPri) {
    		Robot.shooter.setAngleMotors(Robot.oi.xboxController2.getRawAxis(3)*(-1)*(0.6));
    	} else {
    		Robot.shooter.setAngleMotors(Robot.oi.xboxController1.getRawAxis(3)*(-1)*(0.6));
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.setAngleMotors(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
