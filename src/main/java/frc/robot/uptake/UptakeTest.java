// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.uptake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.shooter.ShooterSubsystem;

public class UptakeTest extends CommandBase {
    private UptakeSubsystem uptakeSubsystem;
    private ShooterSubsystem shooterSubsystem;

    /** Creates a new GrabberDefault. */
    public UptakeTest(UptakeSubsystem uptakeSubsystem, ShooterSubsystem shooterSubsystem) {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(uptakeSubsystem);
        this.uptakeSubsystem = uptakeSubsystem;
        addRequirements(shooterSubsystem);
        this.shooterSubsystem = shooterSubsystem;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        uptakeSubsystem.GrabberLower();
        uptakeSubsystem.GrabberIntake();
        uptakeSubsystem.LiftIntake();
        shooterSubsystem.shoot();

    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        uptakeSubsystem.GrabberRaise();
        uptakeSubsystem.GrabberStop();
        uptakeSubsystem.LiftStop();
        shooterSubsystem.stopShooter();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
