// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shooter;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BallConstants;;

public class ShooterSubsystem extends SubsystemBase {
    private CANSparkMax shooterLeft = new CANSparkMax(BallConstants.LEFT_SHOOTER_ID, MotorType.kBrushless);
    private CANSparkMax shooterRight = new CANSparkMax(BallConstants.RIGHT_SHOOTER_ID, MotorType.kBrushless);
    private double speed = 1;

    /** Creates a new ShooterSubsystem. */
    public ShooterSubsystem() {
        shooterLeft.setInverted(false);
        shooterRight.setInverted(true);
    }

    /***
     * This function sets the speed to both shooter motors. They are inverted in the
     * constructor so they spin the same way.
     */
    public void shoot() {
        shooterRight.set(speed);
        shooterLeft.set(speed);
    }

    /***
     * This function stops both shooter motors.
     */
    public void stopShooter() {
        shooterRight.set(0);
        shooterLeft.set(0);
    }

    /***
     * This function returns the average rpm of the shooter motors
     *
     * @return - the motor RPM
     */
    public double getRPM() {
        double leftRPM = shooterLeft.getEncoder().getVelocity();
        double rightRPM = shooterRight.getEncoder().getVelocity();

        double averageRPM = (leftRPM + rightRPM) / 2;
        return averageRPM;
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
