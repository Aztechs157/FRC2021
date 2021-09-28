// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.hopper.HopperSubsystem;
import frc.robot.shooter.ShooterSubsystem;
import frc.robot.turret.TurretSubsystem;
import frc.robot.uptake.UptakeSubsystem;
import frc.robot.uptake.UptakeTest;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Intake.BallPickup;
import frc.robot.Intake.IntakeSubsystem;
import frc.robot.Pneumatics.PneumaticsSubsystem;
import frc.robot.aimer.AimerSubsystem;
import frc.robot.aimer.AimerDebug;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import frc.robot.controls.DriveController;
import frc.robot.controls.OperatorController;
import frc.robot.drive.DriveSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    private final DriveController driveController = new DriveController();
    private final OperatorController operatorController = new OperatorController();

    // The robot's subsystems and commands are defined here...
    private final PneumaticsSubsystem pneumaticsSubsystem = new PneumaticsSubsystem();
    private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem(pneumaticsSubsystem);
    private final HopperSubsystem hopperSubsystem = new HopperSubsystem();
    private final UptakeSubsystem uptakeSubsystem = new UptakeSubsystem(pneumaticsSubsystem);
    private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
    private final TurretSubsystem turretSubsystem = new TurretSubsystem(operatorController);
    private final AimerSubsystem aimerSubsystem = new AimerSubsystem();
    private final DriveSubsystem driveSubsystem = new DriveSubsystem(driveController);

    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {
        var tab = Shuffleboard.getTab("Config");
        tab.add("Layout Chooser", driveController);

        // Configure the button bindings
        configureButtonBindings();
    }

    /**
     * Use this method to define your button->command mappings.
     */
    private void configureButtonBindings() {
        operatorController.button(OperatorController.ButtonKey.PickupBall)
                .toggleWhenPressed(new BallPickup(intakeSubsystem));
        operatorController.button(OperatorController.ButtonKey.TestUptake)
                .toggleWhenPressed(new UptakeTest(uptakeSubsystem, shooterSubsystem));
        operatorController.button(OperatorController.ButtonKey.DebugAimer)
                .toggleWhenPressed(new AimerDebug(aimerSubsystem));
        operatorController.button(OperatorController.ButtonKey.RaiseTargetSpeed)
                .whenPressed(shooterSubsystem::raiseTargetSpeed);
        operatorController.button(OperatorController.ButtonKey.LowerTargetSpeed)
                .whenPressed(shooterSubsystem::lowerTargetSpeed);
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // An ExampleCommand will run in autonomous
        return null;
    }
}
