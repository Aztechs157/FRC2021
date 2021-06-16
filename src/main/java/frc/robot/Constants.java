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
// hopper spark id = 2
// uptake lift spark id = 6
// uptake grabber = 11
// right shooter = 5
// turret spark id = 8
// left shooter = 10
// intake id 4
public final class Constants {

    public final class DriveConstants {
        public static final int FRONT_LEFT_MOTOR_ID = 8;
        public static final int FRONT_RIGHT_MOTOR_ID = 1;
        public static final int BACK_LEFT_MOTOR_ID = 9;
        public static final int BACK_RIGHT_MOTOR_ID = 4;
    }

    public final class OIConstants {
        public static final int DRIVE_CONTROLLER_ID = 0;

        public static final int DRIVE_LEFT_AXIS_ID = 0;
        public static final int DRIVE_RIGHT_AXIS_ID = 0;
    }
}
