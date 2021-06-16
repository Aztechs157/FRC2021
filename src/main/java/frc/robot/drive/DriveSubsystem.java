// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.drive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.DriveConstants.*;

public class DriveSubsystem extends SubsystemBase {
    private final CANSparkMax frontLeftMotor = new CANSparkMax(FRONT_LEFT_MOTOR_ID, MotorType.kBrushless);
    private final CANSparkMax frontRightMotor = new CANSparkMax(FRONT_RIGHT_MOTOR_ID, MotorType.kBrushless);
    private final CANSparkMax backLeftMotor = new CANSparkMax(BACK_LEFT_MOTOR_ID, MotorType.kBrushless);
    private final CANSparkMax backRightMotor = new CANSparkMax(BACK_RIGHT_MOTOR_ID, MotorType.kBrushless);

    private final SpeedControllerGroup leftMotors = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
    private final SpeedControllerGroup rightMotors = new SpeedControllerGroup(frontRightMotor, backRightMotor);

    private final DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

    /** Creates a new DriveSubsystem. */
    public DriveSubsystem(final Joystick driveController) {
        setDefaultCommand(new TeleopDrive(this, driveController));
    }

    public void tankDrive(final double leftSpeed, final double rightSpeed) {
        drive.tankDrive(leftSpeed, rightSpeed);
    }
}
