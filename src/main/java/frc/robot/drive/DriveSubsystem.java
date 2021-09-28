// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.drive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.controls.DriveController;
import frc.robot.controls.DriveController.AxisKey;

import static frc.robot.Constants.DriveConstants.*;

public class DriveSubsystem extends SubsystemBase {

    private final CANSparkMax frontLeftMotor = new CANSparkMax(frontLeftMotorId, MotorType.kBrushless);
    private final CANSparkMax frontRightMotor = new CANSparkMax(frontRightMotorId, MotorType.kBrushless);
    private final CANSparkMax backLeftMotor = new CANSparkMax(backLeftMotorId, MotorType.kBrushless);
    private final CANSparkMax backRightMotor = new CANSparkMax(backRightMotorId, MotorType.kBrushless);

    private final SpeedControllerGroup leftMotors = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
    private final SpeedControllerGroup rightMotors = new SpeedControllerGroup(frontRightMotor, backRightMotor);

    private final DriveController controller;

    public DriveSubsystem(final DriveController controller) {
        this.controller = controller;
        setDefaultCommand(new RunCommand(this::drive, this));
    }

    private void drive() {
        var leftSpeed = controller.getAxis(AxisKey.LeftFoward) * .4;
        var rightSpeed = controller.getAxis(AxisKey.RightFoward) * .4;

        leftMotors.set(-leftSpeed);
        rightMotors.set(-rightSpeed);
    }
}
