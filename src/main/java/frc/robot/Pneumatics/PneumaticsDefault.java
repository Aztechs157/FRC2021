// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Pneumatics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class PneumaticsDefault extends CommandBase {
    private PneumaticsSubsystem pneumaticsSubsystem;

    /** Creates a new PneumaticsDefault. */
    public PneumaticsDefault(PneumaticsSubsystem pneumaticsSubsystem) {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(pneumaticsSubsystem);
        this.pneumaticsSubsystem = pneumaticsSubsystem;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        pneumaticsSubsystem.initCompressor();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        pneumaticsSubsystem.disableCompressor();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
