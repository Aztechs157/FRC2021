// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.hopper.HopperSubsystem;
import frc.robot.uptake.UptakeSubsystem;
import frc.robot.uptake.UptakeTest;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Intake.BallPickup;
import frc.robot.Intake.IntakeSubsystem;
import frc.robot.Pneumatics.PneumaticsSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    private Joystick operatorController = new Joystick(3);

    // The robot's subsystems and commands are defined here...
    private final PneumaticsSubsystem pneumaticsSubsystem = new PneumaticsSubsystem();
    private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem(pneumaticsSubsystem);
    private final HopperSubsystem hopperSubsystem = new HopperSubsystem();
    private final UptakeSubsystem uptakeSubsystem = new UptakeSubsystem(pneumaticsSubsystem);

    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {
        // Configure the button bindings
        configureButtonBindings();
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be
     * created by instantiating a {@link GenericHID} or one of its subclasses
     * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
     * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {
        new JoystickButton(operatorController, 6).toggleWhenPressed(new BallPickup(intakeSubsystem));
        new JoystickButton(operatorController, 5).toggleWhenPressed(new UptakeTest(uptakeSubsystem));
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
