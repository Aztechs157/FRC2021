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
    private Compressor c = new Compressor(PneumaticsConstants.PCM);
    private DoubleSolenoid intake = new DoubleSolenoid(PneumaticsConstants.IntakeSolenoidA,
            PneumaticsConstants.IntakeSolenoidB);
    private DoubleSolenoid grabber = new DoubleSolenoid(PneumaticsConstants.GrabberSolenoidA,
            PneumaticsConstants.GrabberSolenoidB);

    /** Creates a new PneumaticsSubsystem. */
    public PneumaticsSubsystem() {
    }

    /***
     * This function raises or lowers the intake arm depending on the argument
     * armUp.
     *
     * @param armUp - sets the position of the intake arm. True is up, False is
     *              down.
     */
    public void IntakeArmUp(boolean armUp) {
        intake.set(armUp ? Value.kForward : Value.kReverse);
    }

    /***
     * This function initializes the pneumatics default command.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new PneumaticsDefault(this));
    }

    /***
     * This function starts the compressor.
     */
    public void initCompressor() {
        c.start();
    }

    /***
     * This function stops the compressor.
     */
    public void disableCompressor() {
        c.stop();
    }

    /***
     * This function raises or lowers the grabber arm depending on the argument
     * armUp.
     *
     * @param armUp - sets the position of the grabber arm. True is up, False is
     *              down.
     */
    public void GrabberArmUp(boolean armUp) {
        grabber.set(armUp ? Value.kReverse : Value.kForward);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
