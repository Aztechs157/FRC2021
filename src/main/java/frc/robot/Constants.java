// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final class DriveConstants {
        public static final int FRONT_LEFT_MOTOR_ID = 1;
        public static final int FRONT_RIGHT_MOTOR_ID = 2;
        public static final int BACK_LEFT_MOTOR_ID = 3;
        public static final int BACK_RIGHT_MOTOR_ID = 4;
    }

    public final class OIConstants {
        public static final int DRIVE_CONTROLLER_ID = 0;

        public static final int DRIVE_LEFT_AXIS_ID = 0;
        public static final int DRIVE_RIGHT_AXIS_ID = 0;
    }

    public final class BallConstants {
        public static final int INTAKE_ID = 5;
        public static final int HOPPER_ID = 6;
        public static final int UPTAKE_GRABBER_ID = 7;
        public static final int UPTAKE_LIFT_ID = 8;
        public static final int TURRET_ID = 9;
        public static final int RIGHT_SHOOTER_ID = 10;
        public static final int LEFT_SHOOTER_ID = 11;
    }

    public final class PneumaticsConstants {
        public static final int IntakeSolenoidA = 4;
        public static final int IntakeSolenoidB = 5;
        public static final int GrabberSolenoidA = 6;
        public static final int GrabberSolenoidB = 7;
        // PCM ID MUST MUST MUST BE 0!!!
        public static final int PCM = 0;
    }
}
