// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.hopper;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BallConstants;

public class HopperSubsystem extends SubsystemBase {
    private CANSparkMax hopperMotor = new CANSparkMax(BallConstants.HOPPER_ID, MotorType.kBrushed);
    private double speed = -0.6;

    /** Creates a new HopperSubsystem. */
    public HopperSubsystem() {
        System.out.println("Hopper Initialized");
        setDefaultCommand(new HopperDefault(this));
    }

    /***
     * This function spins the hopper counter clockwise, this is the default
     * direction.
     */
    public void HopperCounterClockwiseSpin() {
        hopperMotor.set(speed);
    }

    /***
     * This function spins the hopper clockwise.
     */
    public void HopperClockwiseSpin() {
        hopperMotor.set(-speed);
    }

    /***
     * This function stops the hopper from spinning
     */
    public void HopperStop() {
        hopperMotor.set(0);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
