// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.turret;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.controls.OperatorController;

public class TurretDefault extends CommandBase {
    private TurretSubsystem turretSubsystem;
    private OperatorController operatorController;
    private double speedMultiplier = 0.2;

    /** Creates a new TurretDefault. */
    public TurretDefault(TurretSubsystem turretSubsystem, OperatorController operatorController) {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(turretSubsystem);
        this.turretSubsystem = turretSubsystem;
        this.operatorController = operatorController;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        turretSubsystem.BrakeMode(true);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        turretSubsystem.TurretMotor(operatorController.getAxis(OperatorController.AxisKey.Turret) * speedMultiplier);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        turretSubsystem.BrakeMode(false);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
