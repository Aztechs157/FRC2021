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
     * This will print the left servo position
     *
     * @return - left servo position
     */
    public double getLeftPosition() {
        return leftServo.getAngle();

    }

    /**
     * This will print the left servo position
     *
     * @return - right servo position
     */
    public double getRightPosition() {
        return rightServo.getAngle();
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
