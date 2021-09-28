// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.turret;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TurretConstants;
import frc.robot.controls.OperatorController;

public class TurretSubsystem extends SubsystemBase {
    private AnalogInput turretPos = new AnalogInput(TurretConstants.Potentiometer_ID);
    private CANSparkMax turret = new CANSparkMax(TurretConstants.TURRET_ID, MotorType.kBrushless);

    /** Creates a new TurretSubsystem. */
    public TurretSubsystem(OperatorController operatorController) {
        Shuffleboard.getTab("Turret Stuff").addNumber("turretPos", this::GetPosition);
        setDefaultCommand(new TurretDefault(this, operatorController));
    }

    /***
     * This function gets the turret Potentiometer value. max - 3.5, min - 1.2
     *
     * @return - the value in volts of the turret Potentiometer.
     */
    public double GetPosition() {
        return turretPos.getVoltage();
    }

    /***
     * This function spins the turret at a programmable speed.
     *
     * @param speed - speed to run the turret motor (-1 to 1)
     */
    public void TurretMotor(double speed) {
        double pos = GetPosition();
        if (TurretConstants.TurretMin < pos && pos < TurretConstants.TurretMax) {
            turret.set(speed);
        } else if (pos <= TurretConstants.TurretMin && speed > 0) {
            turret.set(speed);
        } else if (pos >= TurretConstants.TurretMax && speed < 0) {
            turret.set(speed);
        } else {
            turret.set(0);
        }
    }

    /***
     * This function stops the turret motors.
     */
    public void TurretStop() {
        TurretMotor(0);
    }

    /***
     * This function sets the mode of the turret motor to brake or coast mode.
     *
     * @param brakeOn - true means it will be set to brake mode, false means it will
     *                be set to coast mode.
     */
    public void BrakeMode(boolean brakeOn) {
        turret.setIdleMode(brakeOn ? IdleMode.kBrake : IdleMode.kCoast);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
