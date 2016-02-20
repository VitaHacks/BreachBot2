// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2797.BreachBot2;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainLeftTalon1;
    public static SpeedController drivetrainLeftTalon2;
    public static SpeedController drivetrainRightTalon1;
    public static SpeedController drivetrainRightTalon2;
    public static RobotDrive drivetrainRobotDrive;
    public static SpeedController climberClimberTalon;
    public static AnalogPotentiometer climberClimberPot;
    public static Encoder shooterLeftShooterEncoder;
    public static Encoder shooterRightShooterEncoder;
    public static SpeedController shooterLeftShooterTalon;
    public static SpeedController shooterRightShooterTalon;
    public static AnalogGyro shooterShooterAngle;
    public static SpeedController shooterShooterMotor;
    public static Relay shooterKicker;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainLeftTalon1 = new Talon(2);
        LiveWindow.addActuator("Drivetrain", "LeftTalon1", (Talon) drivetrainLeftTalon1);
        
        drivetrainLeftTalon2 = new Talon(3);
        LiveWindow.addActuator("Drivetrain", "LeftTalon2", (Talon) drivetrainLeftTalon2);
        
        drivetrainRightTalon1 = new Talon(0);
        LiveWindow.addActuator("Drivetrain", "RightTalon1", (Talon) drivetrainRightTalon1);
        
        drivetrainRightTalon2 = new Talon(1);
        LiveWindow.addActuator("Drivetrain", "RightTalon2", (Talon) drivetrainRightTalon2);
        
        drivetrainRobotDrive = new RobotDrive(drivetrainLeftTalon1, drivetrainLeftTalon2,
              drivetrainRightTalon1, drivetrainRightTalon2);
        
        drivetrainRobotDrive.setSafetyEnabled(true);
        drivetrainRobotDrive.setExpiration(0.1);
        drivetrainRobotDrive.setSensitivity(0.5);
        drivetrainRobotDrive.setMaxOutput(1.0);

        climberClimberTalon = new Talon(7);
        LiveWindow.addActuator("Climber", "ClimberTalon", (Talon) climberClimberTalon);
        
        climberClimberPot = new AnalogPotentiometer(1, 1.0, 0.0);
        LiveWindow.addSensor("Climber", "ClimberPot", climberClimberPot);
        
        shooterLeftShooterEncoder = new Encoder(3, 4, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "LeftShooterEncoder", shooterLeftShooterEncoder);
        shooterLeftShooterEncoder.setDistancePerPulse(1.0);
        shooterLeftShooterEncoder.setPIDSourceType(PIDSourceType.kRate);
        shooterRightShooterEncoder = new Encoder(5, 6, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "RightShooterEncoder", shooterRightShooterEncoder);
        shooterRightShooterEncoder.setDistancePerPulse(1.0);
        shooterRightShooterEncoder.setPIDSourceType(PIDSourceType.kRate);
        shooterLeftShooterTalon = new TalonSRX(5);
        LiveWindow.addActuator("Shooter", "LeftShooterTalon", (TalonSRX) shooterLeftShooterTalon);
        
        shooterRightShooterTalon = new TalonSRX(6);
        LiveWindow.addActuator("Shooter", "RightShooterTalon", (TalonSRX) shooterRightShooterTalon);
        
        shooterShooterAngle = new AnalogGyro(0);
        LiveWindow.addSensor("Shooter", "ShooterAngle", shooterShooterAngle);
        shooterShooterAngle.setSensitivity(0.007);
        shooterShooterMotor = new Talon(4);
        LiveWindow.addActuator("Shooter", "ShooterMotor", (Talon) shooterShooterMotor);
        
        shooterKicker = new Relay(0);
        LiveWindow.addActuator("Shooter", "Kicker", shooterKicker);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
