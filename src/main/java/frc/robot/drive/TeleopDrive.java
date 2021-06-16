// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import static frc.robot.Constants.OIConstants.*;

public class TeleopDrive extends CommandBase {
    private final Joystick driveController;
    private final DriveSubsystem driveSubsystem;

    /** Creates a new TeleopDrive. */
    public TeleopDrive(final DriveSubsystem driveSubsystem, final Joystick driveController) {
        this.driveSubsystem = driveSubsystem;
        this.driveController = driveController;
        addRequirements(driveSubsystem);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        final double leftSpeed = driveController.getRawAxis(DRIVE_LEFT_AXIS_ID);
        final double rightSpeed = driveController.getRawAxis(DRIVE_RIGHT_AXIS_ID);
        driveSubsystem.tankDrive(leftSpeed, rightSpeed);
    }
}
