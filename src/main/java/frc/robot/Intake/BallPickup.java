// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class BallPickup extends CommandBase {
    private IntakeSubsystem intakeSubsystem;

    /** Creates a new BallPickup. */
    public BallPickup(IntakeSubsystem intakeSubsystem) {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(intakeSubsystem);
        this.intakeSubsystem = intakeSubsystem;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        intakeSubsystem.IntakeDown();
        intakeSubsystem.RollerIntake();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        CommandScheduler.getInstance().schedule(new StopRollers(intakeSubsystem));

        intakeSubsystem.IntakeUp();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
