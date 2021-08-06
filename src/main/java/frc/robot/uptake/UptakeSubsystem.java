// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.uptake;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Pneumatics.PneumaticsSubsystem;
import frc.robot.Constants.BallConstants;

public class UptakeSubsystem extends SubsystemBase {
    private PneumaticsSubsystem pneumaticsSubsystem;
    private CANSparkMax grabberMotor = new CANSparkMax(BallConstants.UPTAKE_GRABBER_ID, MotorType.kBrushless);
    private CANSparkMax liftMotor = new CANSparkMax(BallConstants.UPTAKE_LIFT_ID, MotorType.kBrushless);
    private double grabberSpeed = 1;
    private double liftSpeed = -1;

    /** Creates a new UptakeSubsystem. */
    public UptakeSubsystem(PneumaticsSubsystem pneumaticsSubsystem) {
        this.pneumaticsSubsystem = pneumaticsSubsystem;
    }

    /***
     * This function is a generic up down fuction for the Grabber arm.
     *
     * @param armUp - true would raise the Grabber Arm, false would lower the
     *              Grabber Arm.
     */
    public void GrabberPosition(boolean armUp) {
        pneumaticsSubsystem.GrabberArmUp(armUp);
    }

    /***
     * This function raises the Grabber to it's up position. This position is it's
     * default position.
     */
    public void GrabberRaise() {
        pneumaticsSubsystem.GrabberArmUp(true);
    }

    /***
     * This function lowers the Grabber to it's down position. This position is what
     * will intake balls.
     */
    public void GrabberLower() {
        pneumaticsSubsystem.GrabberArmUp(false);
    }

    /***
     * This function runs the Grabber motor to intake balls.
     */
    public void GrabberIntake() {
        grabberMotor.set(grabberSpeed);
    }

    /***
     * This function runs the grabber motor in reverse to dump balls.
     */
    public void GrabberDump() {
        grabberMotor.set(-grabberSpeed);
    }

    /***
     * This function stops the Grabber motor. for good reasons.
     */
    public void GrabberStop() {
        grabberMotor.set(0);
    }

    /***
     * This function runs the Lift motor to lift a ball to the turret/shooter.
     */
    public void LiftIntake() {
        liftMotor.set(liftSpeed);
    }

    /***
     * This function reverses the Lift motor speed to dump a ball out of the system
     * if the need ever arises.
     */
    public void LiftDump() {
        liftMotor.set(-liftSpeed);
    }

    /***
     * This function stops the lift motor.
     */
    public void LiftStop() {
        liftMotor.set(0);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
