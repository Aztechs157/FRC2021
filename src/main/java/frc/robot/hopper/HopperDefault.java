// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.hopper;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class HopperDefault extends CommandBase {
    private HopperSubsystem hopperSubsystem;

    /** Creates a new HopperDefault. */
    public HopperDefault(HopperSubsystem hopperSubsystem) {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(hopperSubsystem);
        this.hopperSubsystem = hopperSubsystem;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        hopperSubsystem.HopperCounterClockwiseSpin();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        hopperSubsystem.HopperStop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
