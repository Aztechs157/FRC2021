// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Intake;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BallConstants;
import frc.robot.Constants.PneumaticsConstants;
import frc.robot.Pneumatics.PneumaticsSubsystem;

public class IntakeSubsystem extends SubsystemBase {
    private PneumaticsSubsystem pneumaticsSubsystem;
    private double rollerIntakeSpeed = 1;
    private double rollerDumpSpeed = -1;
    private CANSparkMax intakeMotor = new CANSparkMax(BallConstants.INTAKE_ID, MotorType.kBrushless);

    /** Creates a new Intake. */
    public IntakeSubsystem(PneumaticsSubsystem pneumaticsSubsystem) {
        this.pneumaticsSubsystem = pneumaticsSubsystem;
    }

    /***
     * This function is a generic up down fuction for the intake arm.
     *
     * @param raiseUp - true would raise the intake, false would lower the intake.
     */
    public void IntakePosition(boolean raiseUp) {
        pneumaticsSubsystem.IntakeArmUp(raiseUp);
    }

    /***
     * This function is a specific Intake raise up function, it raises the intake
     * arm.
     */
    public void IntakeUp() {
        pneumaticsSubsystem.IntakeArmUp(true);
    }

    /***
     * This function is a specific Intake lower function, it lowers the intake arm.
     */
    public void IntakeDown() {
        pneumaticsSubsystem.IntakeArmUp(false);
    }

    /***
     * This function spins the rollers at the recommended speeds to intake a ball.
     */
    public void RollerIntake() {
        intakeMotor.set(rollerIntakeSpeed);
    }

    /***
     * This function spins the rollers at the recommended speeds to dump a ball.
     */
    public void RollerDump() {
        intakeMotor.set(rollerDumpSpeed);
    }

    /***
     * This function stops the rollers at the recommended speed of 0.
     */
    public void RollerStop() {
        intakeMotor.set(0);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
