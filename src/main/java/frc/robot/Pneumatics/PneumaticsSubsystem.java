// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Pneumatics;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.PneumaticsConstants;

public class PneumaticsSubsystem extends SubsystemBase {
    Compressor c = new Compressor(PneumaticsConstants.PCM);
    DoubleSolenoid intake = new DoubleSolenoid(PneumaticsConstants.IntakeSolenoidA,
            PneumaticsConstants.IntakeSolenoidB);

    /** Creates a new PneumaticsSubsystem. */
    public PneumaticsSubsystem() {
    }

    public void IntakeArmUp(boolean armUp) {
        intake.set(armUp ? Value.kForward : Value.kReverse);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new PneumaticsDefault(this));
    }

    public void initCompressor() {
        c.start();
    }

    public void disableCompressor() {
        c.stop();
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
