// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.aimer;

import frc.robot.Constants.TurretConstants;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AimerSubsystem extends SubsystemBase {
    /** Creates a new AimerSubsystem. */

    private Servo leftServo = new Servo(TurretConstants.leftServo);
    private Servo rightServo = new Servo(TurretConstants.rightServo);

    public AimerSubsystem() {

    }

    /**
     * This method sets the servo's position to whatever 1 is TODO: figure out what
     * 1 is
     */
    public void AimerMaxPosition() {
        rightServo.set(0.5);
        leftServo.set(0);
    }

    /**
     * This method sets the servo's position to whatever 0 is TODO: figure out what
     * 0 is
     */
    public void AimerMinPosition() {
        rightServo.set(0);
        leftServo.set(0.5);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
